package com.uce.edu.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class CitaMedica {

	private LocalDateTime fechaCita;
	private Doctor doctor;
	private Paciente paciente;
	
	//2. inyeccion de dependencia por constructor
	public CitaMedica(Doctor doctor, Paciente paciente) {
		this.doctor = doctor;
		this.paciente = paciente;
	}
	
	public String agendar(LocalDateTime fechaCita,String nombre,String apellido, int edad,
							String ciudad,String nombrepaciente, int edadPaciente) {
		//this.doctor = new Doctor();
		//this.paciente = new Paciente();
		
		this.doctor.setNombre(nombre);
		this.doctor.setApellido(apellido);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(ciudad);
		
		this.paciente.setNombre(nombrepaciente);
		this.paciente.setEdad(edadPaciente);
		
		this.fechaCita = fechaCita;
		
		//se inserta la cita en la base de datos
		return "cita agendada";
	}
	//set y get
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	
	
}
