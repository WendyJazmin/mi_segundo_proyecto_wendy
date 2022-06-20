package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia a) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia en la base de datos: "+a);
	}

	@Override
	public Transferencia buscar(String numeroCuenta) {
		// TODO Auto-generated method stub
		
		Transferencia t = new Transferencia();
		t.setNumeroCuentaestino(numeroCuenta);
		
		System.out.println("se busca la transferencia en la cuenta: "+numeroCuenta);
		return t;
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("se actualizo la transferencia de la cuenta: "+t);

	}

	@Override
	public void eliminar(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("se elimino la transferenica de la cuenta: "+numeroCuenta);

	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		
		List<Transferencia> listaConsultada = new ArrayList<>();
		
		Transferencia trans1 = new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNumeroCuentaestino("1234");
		trans1.setNumeroCuentaOrigen("12567");
		listaConsultada.add(trans1);
		return null;
	}

}
