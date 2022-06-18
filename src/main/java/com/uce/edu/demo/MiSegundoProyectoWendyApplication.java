package com.uce.edu.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiSegundoProyectoWendyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MiSegundoProyectoWendyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Creando el segundo proyecto en STS para Spring Framework");
		System.out.println("segundo cambio");

	}

}
