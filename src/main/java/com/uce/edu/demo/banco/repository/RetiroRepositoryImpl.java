package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository{

	@Override
	public void insertar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("se inserto el retiro: "+r);
	}

	@Override
	public Retiro buscar(String numeroCuenta) {
		// TODO Auto-generated method stub
		
		System.out.println("se busco el retiro en la cuenta: "+numeroCuenta);

		Retiro retiro = new Retiro();
		retiro.setNumeroCuenta(numeroCuenta);
		
		return retiro;
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("se actualizo el retiro: "+r);
	}

	@Override
	public void eliminar(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("se elimino el retiro de la cuenfa: "+numeroCuenta);
	}

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub

		List<Retiro> listaRetiro = new ArrayList<>();
		
		Retiro r1 = new Retiro();
		r1.setNumeroCuenta("1239");
		r1.setMonto(new BigDecimal(25));
		r1.setFechaRetiro(LocalDateTime.of(2022, 12, 20,13, 34, 10));
		listaRetiro.add(r1);
		
		return listaRetiro;
		
	}



}
