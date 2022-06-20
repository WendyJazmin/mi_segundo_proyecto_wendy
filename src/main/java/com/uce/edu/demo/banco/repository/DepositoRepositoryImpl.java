package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository{

	@Override
	public void insertar(Deposito d) {
		System.out.println("Se creo el deposito: "+d);
		
	}

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Deposito> listaDeposito = new ArrayList<>();
		Deposito depo1 = new Deposito();
		depo1.setFechaDeposito(LocalDateTime.of(2021, 2, 10,8, 50, 2));
		depo1.setMonto(new BigDecimal(20));
		depo1.setNumeroCuenta("2345");
		
		listaDeposito.add(depo1);
		
		Deposito depo2 = new Deposito();
		depo2.setFechaDeposito(LocalDateTime.of(2021, 3, 15,9, 53, 2));
		depo2.setMonto(new BigDecimal(50));
		depo2.setNumeroCuenta("1235");
		
		listaDeposito.add(depo2);
		
		return listaDeposito;
	}

	@Override
	public Deposito buscar(String numeroCuenta) {
		// TODO Auto-generated method stub
		Deposito d  = new Deposito();
		d.setNumeroCuenta(numeroCuenta);
		
		System.out.println("Se busca el deposito de la cuenta: "+numeroCuenta);
		return d;
	}

	@Override
	public void actualizar(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el deposito: "+d);

	}

	@Override
	public void eliminar(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el deposito de la cuenta: "+numeroCuenta);

	}

}
