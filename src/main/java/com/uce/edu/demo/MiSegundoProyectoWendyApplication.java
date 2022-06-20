package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IFachadaCuentaBancariaService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.consultorio.CitaMedica2;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class MiSegundoProyectoWendyApplication implements CommandLineRunner{

	@Autowired//inyectando la interface para que el codigo sea mas desacoplado
	private ITransferenciaService transferenciaService;
	
	@Autowired
	private IDepositoService depositoService;
	
	@Autowired
	private IFachadaCuentaBancariaService bancariaService;
	
	@Autowired
	private ProfesorGeneral p;
	
	@Autowired
	private ProfesorMateria materia;
	
	@Autowired
	private ProfesorMateria materia11;
	
	@Autowired
	private ProfesorGeneral p2;
	
	@Autowired
	private ProfesorGeneral p3;
	
	@Autowired
	private IMatriculaService matriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(MiSegundoProyectoWendyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//BigDecimal interes = this.bancariaService.calcularInteres("31");
		//System.out.println(interes);

		System.out.println("EJEMPLO SINGLETON");
		this.p.setNombre("Edison");
		this.p.setApellido("Cayambe");
		
		System.out.println(this.p);
		System.out.println("------------------");
		System.out.println(this.p2);
		
		this.p2.setNombre("Pepito");
		
		System.out.println("------------------");

		System.out.println(this.p);
		
		System.out.println("------------------");

		System.out.println(this.p2);
		
		
		
		System.out.println("\nEJEMPLO PROTOTYPE");
		this.materia.setNombre("Daniel");
		this.materia.setApellido("Teran");
		
		System.out.println(this.materia);
		System.out.println("------------------");

		System.out.println(this.materia11);
		
		System.out.println();
		Matricula matricula = new Matricula();
		matricula.setEstudiante(new Estudiante());
		matricula.setMaterias(new ArrayList<>());
		matricula.setNumero("13123");
		this.matriculaService.ingresarMatricula(matricula);

	}

}
