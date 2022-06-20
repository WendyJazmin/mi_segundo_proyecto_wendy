package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IDepositoRepository;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService{
	
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService bancariaServiceC;
	
	
	@Autowired
	private IRetiroRepository retiroRepository;

	@Override
	public void realizarRetiro(String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = this.bancariaService.buscarCuenta(numeroCtaDestino);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtaDestino.subtract(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.bancariaService.actualizarCuenta(ctaDestino);
		
		Retiro retiro = new Retiro();
		retiro.setMonto(monto);
		retiro.setNumeroCuenta(numeroCtaDestino);
		retiro.setFechaRetiro(LocalDateTime.now());;
		this.retiroRepository.insertar(retiro);
	}

	@Override
	public Retiro buscarRetiro(String numeroCuenta) {
		// TODO Auto-generated method stub
		return this.retiroRepository.buscar(numeroCuenta);
	}

	@Override
	public void actualizarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		this.retiroRepository.actualizar(r);
	}

	@Override
	public void eliminarRetiro(String numeroCuenta) {
		// TODO Auto-generated method stub
		this.retiroRepository.eliminar(numeroCuenta);
	}

}
