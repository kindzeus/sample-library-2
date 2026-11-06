package com.mahendra.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
	title = "Mahendra's Book Library (Spring REST Demo)",
	description = "A Demo for Spring REST with Spring DataJPA and OpenAPI, This project uses In-Memory H2 Database."))
public class LibraryApiApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(LibraryApiApplication.class, args);
	}

}
