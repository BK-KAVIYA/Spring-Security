package com.security.securityconfiguration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
      return   "Home";
    }

    @GetMapping("/user")
    public String userhome(){
        return   "User Home";
    }

    @GetMapping("/admin")
    public String adminhome(){
        return   "Admin Home";
    }
}
