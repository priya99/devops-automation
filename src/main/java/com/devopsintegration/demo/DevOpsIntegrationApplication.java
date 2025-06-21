package com.devopsintegration.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevOpsIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevOpsIntegrationApplication.class, args);
	}

	
	@GetMapping("/welcome")
	public String getMessage() {
		return "WELCOME TO DEVOPS-INTEGRATION";
	}
}
