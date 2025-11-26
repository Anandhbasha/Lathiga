package com.example.basiclogin;

import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {

        if(username.equals("admin") && password.equals("1234")) {
            return "Login Successful! Welcome " + username;
        } else {
            return "Invalid username or password";
        }
    }
}