package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {

	//CRUD
	
		//C: crear/insetar
		public void insertar(Matricula m);
		
		//R: leer/buscar
		public Matricula buscar(String numero);
		
		//U: actualizar
		public void actualizar(Matricula m);
		
		//D: eliminar
		public void eliminar(String numero);
}
