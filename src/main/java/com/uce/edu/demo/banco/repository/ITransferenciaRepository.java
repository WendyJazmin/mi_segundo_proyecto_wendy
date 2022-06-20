package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {
	
	public void insertar(Transferencia a);
	
	//BUSCA UNA LISTA DE TRANSFERENCIA
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio,LocalDateTime fechaFin);
	
	public Transferencia buscar(String numeroCuenta);
	
	public void actualizar(Transferencia t);
	
	public void eliminar(String numeroCuenta);

}
