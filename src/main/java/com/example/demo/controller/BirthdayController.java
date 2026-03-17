package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirthdayController {

    @GetMapping("/")
    public String home() {
        return "<h2>Open /birthday ❤️</h2>";
    }

    @GetMapping("/birthday")
    public String birthdayWish() {
        return "<html>" +
                "<body style='text-align:center; font-family:Arial; background-color:pink;'>" +
                "<h1>🎉 Wishing you a very happy birthday, Assistant Professor Gayathri ❤️ 🎉</h1>" +
                "<p>You are my happiness, my peace, my everything 💖 </p>" +
                "<p>I am lucky to have you in my life 🤗</p>" +
                "<p>Stay happy always 😘</p>" +
                "<img src='/image/Gemini_Generated_Image_i9qe8ri9qe8ri9qe.png' width='250' style='border-radius:15px; margin:10px;'/>"+
                "<h3>- From your Dhanu </h3>" +
                "</body>" +
                "</html>";
    }
}