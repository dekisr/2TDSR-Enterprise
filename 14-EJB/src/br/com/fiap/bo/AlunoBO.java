package br.com.fiap.bo;

import javax.ejb.Local;

@Local
public interface AlunoBO {

	void registrarFalta();
	
	int verificarFaltas();
}
