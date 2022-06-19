package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Override
	public void insertar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("se ha insertado en la base la matricula: "+m);

	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		
		System.out.println("se ha buscado en la base la matricula: "+numero);

		Matricula m = new Matricula();
		m.setNumero(numero);
		return m;
	}

	@Override
	public void actualizar(Matricula m) {
		// TODO Auto-generated method stub
		System.out.println("se ha actualizado en la base la matricula: "+m);

	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("se ha eliminado en la base la matricula: "+numero);

	}

}
