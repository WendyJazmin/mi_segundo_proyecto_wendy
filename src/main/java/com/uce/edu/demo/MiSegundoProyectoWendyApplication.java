package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;

@SpringBootApplication
public class MiSegundoProyectoWendyApplication implements CommandLineRunner{

	@Autowired
	private CitaMedica citaMedica;
	
	@Autowired
	private CitaMedica2 citaMedica2;
	
	public static void main(String[] args) {
		SpringApplication.run(MiSegundoProyectoWendyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		String respuesta = citaMedica.agendar(LocalDateTime.now(), "Pepito", "Teran", 32, "Quito", "Pepito", 19);

		String respuesta2 = citaMedica2.agendar(LocalDateTime.now(), "Pepito", "Teran", 32, "Quito", "Pepito", 19);
		System.out.println(respuesta);
		System.out.println(respuesta2);
	}

}
