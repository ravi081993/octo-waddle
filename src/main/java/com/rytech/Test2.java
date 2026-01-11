package com.rytech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test2")
public class Test2 {
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Test2!";
	}
	@GetMapping("/greeting")
	public String greeting() {
		return "Greetings from Test2!";
	}
    
}
