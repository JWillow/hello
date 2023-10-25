package com.example.hello.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Value("${myenv.secret}")
	private String secret;
	
	@Value("${test.property}")
	private String property;
	
	@GetMapping("/")
	public String index() {
		return "Coucou de Rémy, secret: [" + secret + "] property value: [" + property + "]";
	}
}
