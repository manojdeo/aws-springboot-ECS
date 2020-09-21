package com.manoj.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsSpringbootEcsApplication {
	
	@GetMapping("/ecs")
	public String getMessage() {
		return "Welcome to ECS application";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsSpringbootEcsApplication.class, args);
	}

}
