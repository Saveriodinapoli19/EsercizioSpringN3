package com.example.Esercizio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//NameController dove si mappa il parametro name per:
//restituire il nome alla chiamata GET
//restuiture il nome al contrario (es. da John a nhoJ, usando StringBuilder) alla chiamata POST
//testare le chiamate del API endpoint usando Postman
@SpringBootApplication
public class Esercizio3Application {

	public static void main(String[] args) {
		SpringApplication.run(Esercizio3Application.class, args);
	}

}
