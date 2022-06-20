package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	//el contenedor de Spring Framework va a inyectar la misma instancia
	@Autowired
	private ProfesorGeneral profesorGeneral;//este de tipo singleton,ciclo de vida del bean
	//en cualquier clase que se haga la inyeccion de dependencia
	
	
	@Autowired
	private ProfesorMateria profesorMateria;//tipo prototype ciclo de vida del bean
	
	@Override
	public void ingresarMatricula(Matricula m) {//metodo para crear matricula
		// TODO Auto-generated method stub
		System.out.println("DI desde MatriculaServiceImpl, singleton: "+this.profesorGeneral);
		this.profesorMateria.setNombre("Jeff");
		System.out.println("DI desde MatriculaServiceImpl, prototype: "+this.profesorMateria);

		this.matriculaRepository.insertar(m);
	}

	@Override
	public Matricula buscarMatricula(String numero) {
		// TODO Auto-generated method stub
		return this.matriculaRepository.buscar(numero);
	}

	@Override
	public void actualizarMatricula(Matricula m) {
		// TODO Auto-generated method stub
		this.matriculaRepository.actualizar(m);
	}

	@Override
	public void eliminarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.matriculaRepository.eliminar(numero);
	}

}
