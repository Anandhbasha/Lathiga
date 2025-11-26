package com.example.LoginRegister.controller;

import com.example.LoginRegister.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService service;

    public AuthController(UserService service) {
        this.service = service;
    }

    // REGISTER
    @PostMapping("/register")
    public String register(@RequestBody Map<String, String> body) {
        return service.register(body.get("username"), body.get("password"));
    }

    // LOGIN
    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> body) {
        return service.login(body.get("username"), body.get("password"));
    }
}