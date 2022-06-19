package com.uce.edu.demo.modelo;

public class Materia {

	private String nombre;
	private String semestre; //cuando se realice una operacion matematica, los atributos deben ir con int,double
							//si un atributo no va a realizar una operacion matematica, no debe ir con int sino con strng
	
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
	
}
