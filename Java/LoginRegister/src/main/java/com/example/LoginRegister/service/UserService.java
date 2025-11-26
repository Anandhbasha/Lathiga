package com.example.LoginRegister.service;

import com.example.LoginRegister.entity.User;
import com.example.LoginRegister.repository.UserRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {

    private final UserRepository repo;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    private final String SECRET = "12345678901234567890123456789012";

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    // REGISTER
    public String register(String username, String password) {
        if (repo.findByUsername(username) != null) {
            return "User already exists!";
        }

        User u = new User(username, encoder.encode(password));

        repo.save(u);
        return "Registered Successfully!";
    }

    // LOGIN
    public String login(String username, String password) {

        User user = repo.findByUsername(username);

        if (user == null) {
            return "User not found!";
        }

        if (!encoder.matches(password, user.getPassword())) {
            return "Invalid password!";
        }

        // generate JWT
        String token = Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .signWith(Keys.hmacShaKeyFor(SECRET.getBytes()))
                .compact();

        return token;
    }
}