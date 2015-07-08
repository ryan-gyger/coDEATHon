package com.usaa.itnhap.gollum.garrison.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}