package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "P06_PRODUTO")
@SequenceGenerator(name = "produto", sequenceName = "SQ_P06_PRODUTO", allocationSize = 1)
public class Produto {

  @Id
  @Column(name = "cd_produto")
  @GeneratedValue(generator = "produto", strategy = GenerationType.SEQUENCE)
  private int codigo;

  @OneToMany(mappedBy = "produto")
  private List<ItemCarrinho> itens;

  @ManyToMany(cascade = CascadeType.PERSIST)
  @JoinTable(name = "P06_PRODUTO_FORNECEDOR", joinColumns = @JoinColumn(name = "cd_produto"), inverseJoinColumns = @JoinColumn(name = "cd_fornecedor"))
  private List<Fornecedor> fornecedores;

  public List<Fornecedor> getFornecedores() {
    return fornecedores;
  }

  public void setFornecedores(List<Fornecedor> fornecedores) {
    this.fornecedores = fornecedores;
  }

  public Produto(List<Fornecedor> fornecedores, String nome, double valor) {
    super();
    this.fornecedores = fornecedores;
    this.nome = nome;
    this.valor = valor;
  }

  public Produto() {
    super();
  }

  public Produto(int codigo, List<ItemCarrinho> itens, List<Fornecedor> fornecedores, String nome, double valor) {
    super();
    this.codigo = codigo;
    this.itens = itens;
    this.fornecedores = fornecedores;
    this.nome = nome;
    this.valor = valor;
  }

  @Column(name = "nm_produto")
  private String nome;

  @Column(name = "vl_valor")
  private double valor;

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public List<ItemCarrinho> getItens() {
    return itens;
  }

  public void setItens(List<ItemCarrinho> itens) {
    this.itens = itens;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

}
