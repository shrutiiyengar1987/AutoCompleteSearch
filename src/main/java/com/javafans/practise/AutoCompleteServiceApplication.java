package com.javafans.practise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.javafans.practise")
public class AutoCompleteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoCompleteServiceApplication.class, args);
	}
}
