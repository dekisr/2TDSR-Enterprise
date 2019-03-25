package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "P06_ITEM_CARRINHO")
@SequenceGenerator(name = "item", sequenceName = "SQ_P06_ITEM_CARRINHO", allocationSize = 1)
public class ItemCarrinho {

  @Id
  @Column(name = "cd_item_carrinho")
  @GeneratedValue(generator = "item", strategy = GenerationType.SEQUENCE)
  private int codigo;

  @ManyToOne
  @JoinColumn(name = "cd_carrinho_compra", nullable = true)
  private CarrinhoCompras carrinho;

  @ManyToOne(cascade=CascadeType.PERSIST)
  @JoinColumn(name = "cd_produto", nullable = true)
  private Produto produto;

  @Column(name = "nr_quantidade", nullable = true)
  private int quantidade;

  @Column(name = "vl_valor", nullable = true)
  private double valor;

  public ItemCarrinho() {
    super();
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public CarrinhoCompras getCarrinho() {
    return carrinho;
  }

  public void setCarrinho(CarrinhoCompras carrinho) {
    this.carrinho = carrinho;
  }

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

}