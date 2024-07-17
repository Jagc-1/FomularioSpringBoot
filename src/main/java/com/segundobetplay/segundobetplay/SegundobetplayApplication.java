package com.segundobetplay.segundobetplay;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SegundobetplayApplication {

	public static void main(String[] args) {
		//ESTA ES UNA FORMA DE CAMBIAR EL PUERTO DESDE EL MAIN
		SpringApplication app = new SpringApplication(SegundobetplayApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8091"));
		app.run(args);

		//SpringApplication.run(SegundobetplayApplication.class, args);
	}

	
	


}