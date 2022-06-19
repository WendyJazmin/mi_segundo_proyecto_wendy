package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class MiSegundoProyectoWendyApplication implements CommandLineRunner{

	@Autowired//inyectando la interface para que el codigo sea mas desacoplado
	private ITransferenciaService transferenciaService;
	
	@Autowired
	private IDepositoService depositoService;
	
	public static void main(String[] args) {
		SpringApplication.run(MiSegundoProyectoWendyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		this.transferenciaService.realizarTransferencia("233", "232", new BigDecimal(50));
		
		System.out.println();
		this.depositoService.realizarDeposito("14", new BigDecimal(50));

	}

}
