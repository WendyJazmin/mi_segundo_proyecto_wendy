package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Service
@Qualifier("corriente")
public class CuentaBancariaCorrienteImpl implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepository iCuentaBancariaRepository;
	
	
	@Override
	public void actualizarCuenta(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscarCuenta(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertarCuenta(String numeroCuenta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarCuenta(String numeroCuenta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularInteres(String numeroCta,BigDecimal saldo) {
		// TODO Auto-generated method stub
		//codigo duplicado, lo solucionamos con una fachada, clase gestor
		//CuentaBancaria cuenta = this.iCuentaBancariaRepository.buscar(numeroCta);

		//BigDecimal saldo = null;
		BigDecimal interes = saldo.multiply(new BigDecimal(15)).divide(new BigDecimal(100));
		
		return interes;
	}

}
