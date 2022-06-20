package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

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
		CuentaBancaria cOrigen = this.bancariaService.buscarCuenta(ctaOrigen);
		
		System.out.println("cuenta origen antes de restar el monto a transferir: "+cOrigen);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);//restar del saldo origen el monto
		cOrigen.setSaldo(nuevoSaldoOrigen);
		
		this.bancariaService.actualizarCuenta(cOrigen);
		
		CuentaBancaria cDestino = this.bancariaService.buscarCuenta(ctaDestino);
		System.out.println("cuenta destino antes de que le realicen la transferencia: "+cDestino);

		BigDecimal saldoDestino = cDestino.getSaldo();
		BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);//a la cuentaDestino se le suma el monto, para realizar la transferencia
		cDestino.setSaldo(nuevoSaldoDestino);
		
		this.bancariaService.actualizarCuenta(cDestino);
		
		Transferencia t = new Transferencia();
		t.setMontoTransferir(monto);
		t.setNumeroCuentaestino(ctaDestino);
		t.setNumeroCuentaOrigen(ctaOrigen);
		
		t.setFechaTransferencia(LocalDateTime.now());
		
		this.transferenciaRepositorye.insertar(t);
	}


	@Override
	public Transferencia buscarTransferencia(String ctaOrigen) {
		// TODO Auto-generated method stub
		return this.transferenciaRepositorye.buscar(ctaOrigen);
	}


	@Override
	public void actualizarTransferencia(Transferencia t) {
		// TODO Auto-generated method stub
		this.transferenciaRepositorye.actualizar(t);
	}


	@Override
	public void eliminarTransferencia(String ctaOrigen) {
		// TODO Auto-generated method stub
		this.transferenciaRepositorye.eliminar(ctaOrigen);
	}


	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		return this.transferenciaRepositorye.consultar(cuenta, fechaInicio, fechaFin);
	}

}
