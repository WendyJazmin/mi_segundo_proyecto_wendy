package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl implements IDepositoService{
	
	//aqui se coloca la logica del negocio
	
	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private IDepositoRepository depositoRepository;

	@Override
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = this.bancariaService.buscar(numeroCtaDestino);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtaDestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaDestino);
		
		Deposito deposito = new Deposito();
		deposito.setMonto(monto);
		deposito.setNumeroCuenta(numeroCtaDestino);
		deposito.setFechaDeposito(LocalDateTime.now());
		this.depositoRepository.insertar(deposito);
		
	}

}
