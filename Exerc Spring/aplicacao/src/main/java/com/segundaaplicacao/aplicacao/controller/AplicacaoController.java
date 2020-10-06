package com.segundaaplicacao.aplicacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HaBeMen")
public class AplicacaoController {
	
	@GetMapping
	public String HaBeMen() {
		
		return "Meus objetivos da semana é aprender Spring no Java e Java com Banco de Dados.";
		
	}

}
