package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_PESSOA_JURIDICA")
public class PessoaJuridica extends Pessoa {

	@Column(name="nr_cnpj")
	private String cnpj;
	
	@Column(name="dt_abertura")
	@Temporal(TemporalType.DATE)
	private Calendar dataAbertura;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, String cnpj, Calendar dataAbertura) {
		super(nome);
		this.cnpj = cnpj;
		this.dataAbertura = dataAbertura;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
}
