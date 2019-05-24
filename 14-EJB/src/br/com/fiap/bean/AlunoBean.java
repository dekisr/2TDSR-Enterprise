package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.fiap.bo.AlunoBO;

@ManagedBean
@ViewScoped
public class AlunoBean {

	private int total;
	
	@EJB
	private AlunoBO bo;
	
	public void faltar() {
		bo.registrarFalta();
		total = bo.verificarFaltas();
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}