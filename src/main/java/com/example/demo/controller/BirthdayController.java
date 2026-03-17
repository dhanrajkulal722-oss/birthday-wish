package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirthdayController {

	@GetMapping("/birthday")
	public String birthdayWish() {
	    return "<!DOCTYPE html>" +
	            "<html>" +
	            "<head>" +
	            "<meta name='viewport' content='width=device-width, initial-scale=1.0'>" +

	            "<style>" +
	            "body { text-align:center; font-family:Arial; background-color:pink; }" +
	            "#typing { font-size:26px; color:red; margin-top:20px; font-weight:bold; }" +
	            "</style>" +

	            "</head>" +

	            "<body>" +

	            "<h1>🎉 Wishing you a very happy birthday, Assistant Professor Gayathri ❤️ 🎉</h1>" +
	            "<p>You are my happiness, my peace, my everything 💖 </p>" +
	            "<p>I am lucky to have you in my life 🤗</p>" +
	            "<p>Stay happy always 😘</p>" +

	            "<img src='/image/Gemini_Generated_Image_i9qe8ri9qe8ri9qe.png' width='250' style='border-radius:15px; margin:10px;'/>" +

	            "<h3>- From your Dhanu </h3>" +

	            "<div id='typing'></div>" +

	            "<script>" +
	            "var text = 'Once again Happy Birthday Baaale ...❤️';" +
	            "var i = 0;" +
	            "function typingEffect() {" +
	            "  if (i < text.length) {" +
	            "    document.getElementById('typing').innerHTML += text.charAt(i);" +
	            "    i++;" +
	            "    setTimeout(typingEffect, 100);" +
	            "  }" +
	            "}" +
	            "window.onload = function() {" +
	            "  setTimeout(typingEffect, 1000);" +
	            "};" +
	            "</script>" +

	            "</body>" +
	            "</html>";
	}
}