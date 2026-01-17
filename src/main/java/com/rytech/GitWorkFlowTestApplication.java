package com.rytech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class GitWorkFlowTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitWorkFlowTestApplication.class, args);
	}
@GetMapping
	public String getMsg(){
		return """
				Welcome to controller
				""";
}
}
