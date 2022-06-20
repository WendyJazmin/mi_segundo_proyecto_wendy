package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.IDepositoRepository;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;
import com.uce.edu.demo.banco.to.TransaccionTo;


@Service
public class TransaccionServiceImpl implements ITransaccionService{

	@Autowired
	private ITransferenciaService transferenciaService;
	
	@Autowired
	private IDepositoService depositoService;
	
	@Autowired
	private IRetiroService retiroService;
	
	@Autowired
	private ITransferenciaRepository transferenciaRepository;
	
	@Autowired
	private IDepositoRepository depositoRepository;
	
	@Autowired
	private IRetiroRepository retiroRepository;
	
	@Override
	public void transferencia(String origen, String deposito, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.transferenciaService.realizarTransferencia(origen, deposito, monto);
	}

	@Override
	public void deposito(String cuenta, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.depositoService.realizarDeposito(cuenta, monto);
	}

	@Override
	public void retiro(String cuenta, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.retiroService.realizarRetiro(cuenta, monto);
	}

	@Override
	public List<TransaccionTo> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Transferencia> listaTrans = this.transferenciaRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Deposito> listaDeposito = this.depositoRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Retiro> listaRetiro = this.retiroRepository.consultar(cuenta, fechaInicio, fechaFin);
		
		List<TransaccionTo>  listaFinal = new ArrayList<>();
		
		//lista de transferencias
		for(Transferencia t: listaTrans) {
			TransaccionTo transaccionTo = this.transformar(t);
			listaFinal.add(transaccionTo);
		}
		
		//lista de deposito
		for(Deposito d:listaDeposito) {
			TransaccionTo transaccionTo = this.transformar(d);
			listaFinal.add(transaccionTo);
		}
		
		//lista retiro
		for(Retiro r:listaRetiro) {
			TransaccionTo transaccionTo = this.transformar(r);
			listaFinal.add(transaccionTo);
		}
		return listaFinal;
		
	}

	private TransaccionTo transformar(Transferencia t) {
		TransaccionTo tranTo = new TransaccionTo();
		tranTo.setFecha(t.getFechaTransferencia());
		tranTo.setMonto(t.getMontoTransferir());
		tranTo.setTipo("T");
		return tranTo;
	}
	
	
	private TransaccionTo transformar(Deposito d) {
		TransaccionTo tranTo = new TransaccionTo();
		tranTo.setFecha(d.getFechaDeposito());
		tranTo.setMonto(d.getMonto());
		tranTo.setTipo("D");
		return tranTo;
	}
	
	private TransaccionTo transformar(Retiro r) {
		TransaccionTo tranTo = new TransaccionTo();
		tranTo.setFecha(r.getFechaRetiro());
		tranTo.setMonto(r.getMonto());
		tranTo.setTipo("R");
		return tranTo;
	}
	
}
