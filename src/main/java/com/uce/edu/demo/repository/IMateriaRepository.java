package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;

public interface IMateriaRepository {

	//en la interface solo van contratos
		//CRUD
		
		//C: crear/insetar
		public void insertar(Materia m);
		
		//R: leer/buscar
		public Materia buscar(String nombre);
		
		//U: actualizar
		public void actualizar(Materia e);
		
		//D: eliminar
		public void eliminar(String nombre);

}
