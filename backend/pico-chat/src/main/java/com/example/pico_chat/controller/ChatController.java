package com.example.pico_chat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    
    @GetMapping("/index")
    public String index(){
        return "chat/index";
    }

    @GetMapping("/")
    public String home() {
        return "Hello, Spring Boot!";
    }
}



