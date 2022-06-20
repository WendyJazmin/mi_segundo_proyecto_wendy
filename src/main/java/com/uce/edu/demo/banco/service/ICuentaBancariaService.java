package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	

	public void actualizarCuenta(CuentaBancaria c);
	
	public CuentaBancaria buscarCuenta(String numero);
	
	public void insertarCuenta(String numeroCuenta, BigDecimal saldo);

	public void eliminarCuenta(String numeroCuenta);
	
	//metodo adicional calcular interes (lunes 13/06/2022)
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo);//aqui se le puede pasar toda la CuentaBancaria o solo algun de dato de la cuenta bancaria solo cuando vamos a utilizar ese dato

}
