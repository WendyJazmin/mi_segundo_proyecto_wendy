package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {
	
		public void insertar(Deposito d);
		
		public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio,LocalDateTime fechaFin);

		
		//R: Leer/buscar
		public Deposito buscar(String numeroCuenta);
		
		//U: actualizar
		public void actualizar(Deposito d);
		
		//D: eliminar
		public void eliminar(String numeroCuenta);

}
