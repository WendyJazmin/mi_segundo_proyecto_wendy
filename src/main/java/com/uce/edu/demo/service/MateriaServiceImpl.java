package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IMateriaRepository;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	private IMateriaRepository materiaRepository;

	@Override
	public void ingresarMateria(Materia m) {
		// TODO Auto-generated method stub
		this.materiaRepository.insertar(m);
	}

	@Override
	public Materia buscarMateria(String nombre) {
		// TODO Auto-generated method stub
		return this.materiaRepository.buscar(nombre);
	}

	@Override
	public void actualizarMateria(Materia m) {
		// TODO Auto-generated method stub
		this.materiaRepository.actualizar(m);
	}

	@Override
	public void eliminarMateria(String nombre) {
		// TODO Auto-generated method stub
		this.materiaRepository.eliminar(nombre);
	}
	
	
}
