package com.projeto.desafioanota;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class DesafioAnotaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioAnotaApplication.class, args);
	}

}
