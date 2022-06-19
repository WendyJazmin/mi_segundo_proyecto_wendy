package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Deposito {
	
	private LocalDateTime fechaDeposito;
	private String numeroCuenta;
	private BigDecimal monto;
	
	@Override
	public String toString() {
		return "Deposito [fechaDeposito=" + fechaDeposito + ", numeroCuenta=" + numeroCuenta + ", monto=" + monto + "]";
	}
	
	//set y get
	public LocalDateTime getFechaDeposito() {
		return fechaDeposito;
	}
	public void setFechaDeposito(LocalDateTime fechaDeposito) {
		this.fechaDeposito = fechaDeposito;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	

	
}
