package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

@Service

//la clase TransferenciaServiceImpl es una clase orquestadora,gestora
public class TransferenciaServiceImpl implements ITransferenciaService{

	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private ITransferenciaRepository transferenciaRepositorye;
	
	
	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(ctaOrigen);
		
		System.out.println("cuenta origen antes de restar el monto a transferir: "+cOrigen);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);//restar del saldo origen el monto
		cOrigen.setSaldo(nuevoSaldoOrigen);
		
		this.bancariaService.actualizar(cOrigen);
		
		CuentaBancaria cDestino = this.bancariaService.buscar(ctaDestino);
		System.out.println("cuenta destino antes de que le realicen la transferencia: "+cDestino);

		BigDecimal saldoDestino = cDestino.getSaldo();
		BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);//a la cuentaDestino se le suma el monto, para realizar la transferencia
		cDestino.setSaldo(nuevoSaldoDestino);
		
		this.bancariaService.actualizar(cDestino);
		
		Transferencia t = new Transferencia();
		t.setMontoTransferir(monto);
		t.setNumeroCuentaestino(ctaDestino);
		t.setNumeroCuentaOrigen(ctaOrigen);
		
		t.setFechaTransferencia(LocalDateTime.now());
		
		this.transferenciaRepositorye.insertar(t);
	}

}
