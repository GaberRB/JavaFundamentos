package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@GetMapping(path = "/ola")
	public String ola() {
		return "Olá Spring Boot";
	}
	
	@PostMapping(path = "/ola2")
	public String ola2() {
		return "Olá Spring Boot";
	}

}
