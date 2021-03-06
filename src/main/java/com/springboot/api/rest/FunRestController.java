package com.springboot.api.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${coach.name}") // custom name from properties field
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello My Dear the time is: " + LocalDateTime.now();
	}
	
	@GetMapping("/work")
	public String workout() {
		return "Doing very good exercises, Good Job "+coachName+" "+ teamName;
	}
	
}
