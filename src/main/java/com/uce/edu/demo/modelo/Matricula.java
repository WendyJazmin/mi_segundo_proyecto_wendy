package com.uce.edu.demo.modelo;

import java.util.List;

public class Matricula {
	private String numero;
	private Estudiante estudiante;
	private List<Materia> materias;
	
	@Override
	public String toString() {
		return "Matricula [numero=" + numero + ", estudiante=" + estudiante + ", materias=" + materias + "]";
	}
	//get y set
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public List<Materia> getMaterias() {
		return materias;
	}
	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	
	

}
