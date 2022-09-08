package edu.institute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome") // HTTP GET
	public String welcomeMsg() {
		 return "Welcome To First Spring Boot REST API....";
	}
	
	
	@GetMapping("/say-hi")
	public String hiMsg() {
		 return "Hi.., welcome To First Spring Boot REST API....";
	}
	
}
