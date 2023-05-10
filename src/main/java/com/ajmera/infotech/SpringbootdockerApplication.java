package com.ajmera.infotech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootdockerApplication {
	
	@GetMapping("/")
	public String getMessage() {
		return "This is a sample project for dockering of spring boot application ";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdockerApplication.class, args);
	}

}
