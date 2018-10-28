package com.cloudy.authcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
public class AuthCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthCenterApplication.class, args);
	}
}
