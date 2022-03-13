package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "calculadora")
public class CalculadoraController {
	
	//calculadora/somar/10/20
	@GetMapping(path = "/{n1}/{n2}")
	public int somar(@PathVariable int n1, @PathVariable int n2) {
		return n1 + n2;
	}
	//colculadora/subtrair?a=10&b=20
	@GetMapping(path = "/subtrair")
	public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
		return a - b;
	}

}
