package com.rytech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test2")
public class Test2 {
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Test2! and made chanhes in branch Rohit";
	}
    //Adding one more end point for Test2 class
	@GetMapping("/greet")
	public String greet() {
		return "Greetings from Test2!";
	}
}
