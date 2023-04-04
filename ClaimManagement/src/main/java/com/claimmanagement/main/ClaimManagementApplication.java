package com.claimmanagement.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class ClaimManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClaimManagementApplication.class, args);
	}

}
