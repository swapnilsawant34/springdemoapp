package com.example.demo.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCtrl {
    @GetMapping("/welcome")
    public String home() {
		return "welcome to Spring boot application";
    	
    }
}
