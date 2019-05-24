package br.com.fiap.bo.impl;

import javax.ejb.Singleton;
import javax.ejb.Stateful;
import br.com.fiap.bo.AlunoBO;

//@Stateful
@Singleton
public class AlunoBOImpl implements AlunoBO {

	private int faltas;
	
	@Override
	public void registrarFalta() {
		faltas++;
	}

	@Override
	public int verificarFaltas() {
		return faltas;
	}
	
}