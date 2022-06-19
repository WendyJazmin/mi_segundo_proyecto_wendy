package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Estudiante;

public interface IEstudianteService {
	//capa service: aqui se pone todos los metodos de logica de negocio,
	//no en esta interface no siempre tiene los mismos metodos que la interface repository
	
	public void ingresarEstudiante(Estudiante e);
	
	public Estudiante buscarPorApellido(String apellido);
	
	public void actualizarEstudiante(Estudiante e);
	
	public void eliminarEstudiante(String cedula);

}
