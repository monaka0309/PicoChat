package com.example.pico_chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {
    
    @RequestMapping("")
    public String sample(){
        return "chat/sample";
    }
}