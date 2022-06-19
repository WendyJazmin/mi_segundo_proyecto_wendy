package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class MiSegundoProyectoWendyApplication implements CommandLineRunner{

	@Autowired//inyectando la interface para que el codigo sea mas desacoplado
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(MiSegundoProyectoWendyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Estudiante e = new Estudiante();
		e.setNombre("Edison");
		e.setApellido("Cayambe");
		e.setCedula("1223435");
		
		this.estudianteService.ingresarEstudiante(e);

		
		Estudiante e1 = new Estudiante();
		e1.setNombre("Pepito");
		e1.setApellido("Perez");
		e1.setCedula("09922382");
		this.estudianteService.ingresarEstudiante(e1);
		
		
		//usar los 3 metodos restantes
		e.setCedula("13224");
		this.estudianteService.actualizarEstudiante(e);
		this.estudianteService.buscarPorApellido("Cayambe");
		this.estudianteService.eliminarEstudiante("09922382");

	}

}
