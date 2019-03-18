package br.com.fiap.entity;

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
  @JoinColumn(name = "cd_carrinho_compra", nullable = false)
  private CarrinhoCompras carrinho;

  @ManyToOne
  @JoinColumn(name = "cd_produto", nullable = false)
  private Produto produto;

  @Column(name = "nr_quantidade", nullable = false)
  private int quantidade;

  @Column(name = "vl_valor", nullable = false)
  private double valor;
}
