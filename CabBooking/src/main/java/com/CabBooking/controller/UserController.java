package com.CabBooking.controller;

import com.CabBooking.Model.User;
import com.CabBooking.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserService service;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/registration")
    public User registration(@Valid @RequestBody User user){
        System.out.println("Hi I am Akshay");
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return  service.registration(user);
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>>  login(@RequestBody User user){
        String token = service.login(user);
        return ResponseEntity.ok(Collections.singletonMap("token",token));
    }

    @GetMapping
    public String dashboard(){
        return "Dashboard page";
    }
}
