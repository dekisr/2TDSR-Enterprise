package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PACIENTE")
@SequenceGenerator(name="seqPaciente", sequenceName="SEQ_T_PACIENTE", allocationSize=1)
public class Paciente {

  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqPaciente")
  @Column(name="cd_paciente", nullable=false)
  private int codigo;
  
  @Column(name="nm_paciente", nullable=false)
  private int nome;

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public int getNome() {
    return nome;
  }

  public void setNome(int nome) {
    this.nome = nome;
  }
  
}
