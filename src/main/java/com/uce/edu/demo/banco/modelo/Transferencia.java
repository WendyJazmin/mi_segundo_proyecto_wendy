package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transferencia {

	private String numeroCuentaOrigen;
	private String numeroCuentaestino;
	private BigDecimal montoTransferir;
	private LocalDateTime fechaTransferencia;
	
	
	@Override
	public String toString() {
		return "Transferencia [numeroCuentaOrigen=" + numeroCuentaOrigen + ", numeroCuentaestino=" + numeroCuentaestino
				+ ", montoTransferir=" + montoTransferir + ", fechaTransferencia=" + fechaTransferencia + "]";
	}
	//set y get
	public String getNumeroCuentaOrigen() {
		return numeroCuentaOrigen;
	}
	public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
		this.numeroCuentaOrigen = numeroCuentaOrigen;
	}
	public String getNumeroCuentaestino() {
		return numeroCuentaestino;
	}
	public void setNumeroCuentaestino(String numeroCuentaestino) {
		this.numeroCuentaestino = numeroCuentaestino;
	}
	public BigDecimal getMontoTransferir() {
		return montoTransferir;
	}
	public void setMontoTransferir(BigDecimal montoTransferir) {
		this.montoTransferir = montoTransferir;
	}
	public LocalDateTime getFechaTransferencia() {
		return fechaTransferencia;
	}
	public void setFechaTransferencia(LocalDateTime fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}
	
	
	
	
}
