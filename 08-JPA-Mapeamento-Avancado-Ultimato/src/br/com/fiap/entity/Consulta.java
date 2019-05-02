package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@IdClass(ConsultaPK.class)
@Table(name="T_CONSULTA")
public class Consulta {

	@Id
	@ManyToOne
	@JoinColumn(name="nr_crm")
	private Medico medico;
	
	@Id
	@ManyToOne
	@JoinColumn(name="cd_paciente")
	private Paciente paciente;
	
	@Id
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_consulta")
	private Calendar data;
	
	@Column(name="ds_medicacao")
	private String medicacao;
	
	public Consulta(Medico medico, Paciente paciente, Calendar data, String medicacao) {
		super();
		this.medico = medico;
		this.paciente = paciente;
		this.data = data;
		this.medicacao = medicacao;
	}

	public Consulta() {
		super();
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getMedicacao() {
		return medicacao;
	}

	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}
	
}
