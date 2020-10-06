package com.Hello.HelloWord.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloController {
	
	@GetMapping
	public String Hello() {
		return "Usei a habilidade de persistência e a mentalidade de atenção aos detalhes.";
		
	}
	
}
