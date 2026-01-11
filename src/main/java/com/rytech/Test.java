package com.rytech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class Test {
    //Add one end point
		@GetMapping("/hello")	
		public String hello() {
			return "Hello from Test!";
		}
		
}
