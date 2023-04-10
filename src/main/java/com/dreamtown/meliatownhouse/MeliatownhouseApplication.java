package com.dreamtown.meliatownhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.dreamtown.meliatownhouse.config.PasswordEncode;

@SpringBootApplication
public class MeliatownhouseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeliatownhouseApplication.class, args);
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new PasswordEncode();
	}
}
