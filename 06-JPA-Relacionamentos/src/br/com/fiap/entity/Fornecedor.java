package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "P06_FORNECEDOR")
@SequenceGenerator(name = "fornecedor", sequenceName = "SQ_P06_FORNECEDOR", allocationSize = 1)
public class Fornecedor {

  @Id
  @Column(name = "cd_fornecedor")
  @GeneratedValue(generator = "fornecedor", strategy = GenerationType.SEQUENCE)
  private int codigo;

  @Column(name = "nm_fornecedor", nullable = false)
  private String nome;

  @Column(name = "nr_cnpj", nullable = false)
  private String cnpj;

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

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

}
