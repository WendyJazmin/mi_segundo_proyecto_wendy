package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.to.TransaccionTo;

public interface ITransaccionService {

	public void transferencia (String origen, String deposito, BigDecimal monto);
	
	public void deposito(String cuenta, BigDecimal monto);
	
	public void retiro (String cuenta, BigDecimal monto);
	
	public List<TransaccionTo> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

	
	
}
