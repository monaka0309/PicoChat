package com.example.pico_chat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @GetMapping("/")
    public String home() {
        return "Hello, RestController! jsonファイルが飛んでるよ。";
    }
}



