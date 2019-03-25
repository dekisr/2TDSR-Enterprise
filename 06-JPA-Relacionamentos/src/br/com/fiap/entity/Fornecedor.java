package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
  
  @ManyToMany(mappedBy="fornecedores")
  private List<Produto> produtos;

  
  public Fornecedor(int codigo, String nome, String cnpj, List<Produto> produtos) {
    super();
    this.codigo = codigo;
    this.nome = nome;
    this.cnpj = cnpj;
    this.produtos = produtos;
  }

  public Fornecedor(String nome, String cnpj) {
    super();
    this.nome = nome;
    this.cnpj = cnpj;
  }

  public Fornecedor() {
    super();
  }

  public List<Produto> getProdutos() {
    return produtos;
  }

  public void setProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }

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
