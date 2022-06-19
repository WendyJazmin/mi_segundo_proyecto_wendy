package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository{

	@Override
	public void insertar(Materia m) {
		// TODO Auto-generated method stub
		System.out.println("se ha insertado en la base la materia: "+m);

	}

	@Override
	public Materia buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("se ha buscado en la base la materia: "+nombre);

		Materia materia = new Materia();
		materia.setNombre(nombre);
		return materia;
	}

	@Override
	public void actualizar(Materia e) {
		// TODO Auto-generated method stub
		System.out.println("se ha actualizado en la base la materia: "+e);

	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("se ha eliminado en la base la materia: "+nombre);

	}

}
