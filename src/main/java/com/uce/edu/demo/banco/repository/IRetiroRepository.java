package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;

public interface IRetiroRepository {
	
	public void insertar(Retiro r);
	
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio,LocalDateTime fechaFin);

	
	//R: Leer/buscar
		public Retiro buscar(String numeroCuenta);
		
		//U: actualizar
		public void actualizar(Retiro r);
		
		//D: eliminar
		public void eliminar(String numeroCuenta);

}
