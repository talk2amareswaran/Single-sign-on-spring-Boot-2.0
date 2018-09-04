package com.talk2amareswaran.projects.okta_demo_app;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class OktaDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OktaDemoAppApplication.class, args);
	}
	
	@GetMapping("/")
	public String getUsersEmailAddress(Principal principal) {
		return "Hello your Email address is: "+principal.getName();
	}
}
