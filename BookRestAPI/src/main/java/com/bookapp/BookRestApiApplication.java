package com.bookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BookRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookRestApiApplication.class, args);
	
}
}
