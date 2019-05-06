package br.com.fiap.bean;

import java.io.Serializable;

public class Aluno implements Serializable {
  /**
   * 
   */
  private static final long serialVersionUID = 1291781083447584919L;
  private String nome;
  private int rm;
  private boolean formado;

  public Aluno() {
    super();
  }
  public Aluno(String nome, int rm, boolean formado) {
    super();
    this.nome = nome;
    this.rm = rm;
    this.formado = formado;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public int getRm() {
    return rm;
  }
  public void setRm(int rm) {
    this.rm = rm;
  }
  public boolean isFormado() {
    return formado;
  }
  public void setFormado(boolean formado) {
    this.formado = formado;
  }
}
