package br.com.fiap.revisao.bean;

public class Veiculo {
  private String cor;
  private String nome;

//  public Veiculo() {}
  public Veiculo(String nome) {
    this.nome = nome;
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }
}