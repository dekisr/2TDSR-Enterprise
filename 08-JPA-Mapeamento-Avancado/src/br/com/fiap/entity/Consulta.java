package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CONSULTA")
@SequenceGenerator(name="seqConsulta", sequenceName="SEQ_T_CONSULTA", allocationSize=1)
public class Consulta {
  
  @Id
  @ManyToOne
  @JoinColumn(name="nr_crm")
  private Medico medico;
  
  @Id
  @ManyToOne
  @JoinColumn(name="cd_paciente")
  private Paciente paciente;

//  @Id
//  @Column(name="dt_consulta", nullable=false)
  private Calendar data;
  
  @Column(name="ds_diagnostico")
  private String diagnostico;

}
