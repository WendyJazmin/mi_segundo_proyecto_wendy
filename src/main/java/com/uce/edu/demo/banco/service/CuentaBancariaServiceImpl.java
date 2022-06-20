package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService{

	
	@Autowired
	private ICuentaBancariaRepository  cuentaBancariaRepository;
	

	@Override
	public void actualizarCuenta(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepository.actualizar(c);
	}

	@Override
	public CuentaBancaria buscarCuenta(String numero) {
		// TODO Auto-generated method stub
		return this.cuentaBancariaRepository.buscar(numero);
	}

	@Override
	public void insertarCuenta(String numeroCuenta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		CuentaBancaria c = this.cuentaBancariaRepository.buscar(numeroCuenta);
		c.setSaldo(saldo);
		this.cuentaBancariaRepository.insertar(c);
	}

	@Override
	public void eliminarCuenta(String numeroCuenta) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepository.eliminar(numeroCuenta);
	}

}
