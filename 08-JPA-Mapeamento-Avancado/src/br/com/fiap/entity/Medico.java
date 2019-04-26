package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_MEDICO")
@SequenceGenerator(name="seqMedico", sequenceName="SEQ_T_MEDICO", allocationSize=1)
public class Medico {

  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqMedico")
  @Column(name="nr_crm", nullable=false)
  private int crm;

  @Column(name="nm_medico", nullable=false)
  private String nome;

  @Column(name="ds_especialidade")
  private String especialidade;

  public int getCrm() {
    return crm;
  }
  public void setCrm(int crm) {
    this.crm = crm;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getEspecialidade() {
    return especialidade;
  }
  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }
}
