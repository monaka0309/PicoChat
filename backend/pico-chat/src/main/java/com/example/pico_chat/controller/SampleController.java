package com.example.pico_chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SampleController {
    
    @RequestMapping("")
    public String sample(){
        return "chat/index";
    }
}