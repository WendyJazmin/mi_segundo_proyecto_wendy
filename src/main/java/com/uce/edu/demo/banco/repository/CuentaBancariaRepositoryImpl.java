package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	
	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		System.out.println("Cuenta bancaria actualizada a: "+c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		
		System.out.println("Se busca la cuenta Bancaria: "+numero);
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.setNumero(numero);
		cuenta.setSaldo(new BigDecimal(100));
		cuenta.setTipo("A");
		return cuenta;
	}

	@Override
	public void insertar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		System.out.println("Cuenta insertada"+c);
	}

	@Override
	public void eliminar(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Cuenta eliminada: "+numeroCuenta);

	}

}
