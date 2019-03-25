package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_USUARIO")
@SequenceGenerator(name = "usuario", sequenceName = "SEQ_TAB_USUARIO", allocationSize = 1)
public class Usuario {

  @Id
  @Column(name = "cd_usuario")
  @GeneratedValue(generator = "usuario", strategy = GenerationType.SEQUENCE)
  private int codigo;

  @Column(name = "nm_usuario", length = 50, nullable = false)
  private String nome;

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
