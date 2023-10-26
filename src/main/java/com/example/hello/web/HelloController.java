package com.example.hello.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.service.HelloService;

import lombok.extern.java.Log;


@RestController
@Log
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@Value("${myenv.secret}")
	private String secret;
	
	@Value("${test.property}")
	private String property;
	
	@GetMapping("/")
	public String index() {
		log.info("Index is calling !!!");
		helloService.hello();
		return "Coucou de Rémy, secret: [" + secret + "] property value: [" + property + "]";
	}
}
