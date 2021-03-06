package com.sanatorio.Sanatorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/CMedico")
@SpringBootApplication
@RestController
public class SanatorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SanatorioApplication.class, args);
	}

	@GetMapping("/saludo")
	public String saludo(){
	return "Hola";
	}
}
