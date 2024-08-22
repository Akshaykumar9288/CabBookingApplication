package com.CabBooking.service;


import com.CabBooking.JwtService.JwtService;
import com.CabBooking.Model.User;
import com.CabBooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtService jwtService;
    @Autowired
    private UserDetailServiceImpl userDetailService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registration(User user){
        return repository.save(user);
    }

    public String login(User user){
        System.out.println("Attempting to authenticate user: " + user.getEmail());
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(),user.getPassword()));
        System.out.println("Hi I am Akshay");
       if (authentication.isAuthenticated()){
           System.out.println("Authentication successful for user: " + user.getEmail());
           return jwtService.generateToken(userDetailService.loadUserByUsername(user.getEmail()));
       }else {
           System.out.println("Authentication failed for user: " + user.getEmail());
           throw new UsernameNotFoundException("User Not Found");
       }
    }
}
