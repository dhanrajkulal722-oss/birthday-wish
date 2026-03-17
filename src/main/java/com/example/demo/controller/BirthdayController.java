package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BirthdayController {

    @GetMapping("/birthday")
    public String birthdayPage() {
        return "birthday"; // first page
    }

    @GetMapping("/letter")
    public String letterPage() {
        return "letter"; // second page
    }
}