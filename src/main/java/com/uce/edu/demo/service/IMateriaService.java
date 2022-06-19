package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;

public interface IMateriaService {
	
	public void ingresarMateria(Materia m);
	
	public Materia buscarMateria(String nombre);
	
	public void actualizarMateria(Materia m);
	
	public void eliminarMateria(String nombre);

}
