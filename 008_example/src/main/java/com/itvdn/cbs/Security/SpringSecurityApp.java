package com.itvdn.cbs.Security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityApp {

	// посилання для відкриття у браузері вікна http://localhost:8080/auth/login

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApp.class, args);
	}

}
