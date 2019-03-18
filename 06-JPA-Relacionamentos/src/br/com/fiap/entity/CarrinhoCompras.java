package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "P06_CARRINHO_COMPRA")
@SequenceGenerator(name = "carrinho", sequenceName = "SQ_P06_CARRINHO_COMPRA", allocationSize = 1)
public class CarrinhoCompras {

  @Id
  @Column(name = "cd_carrinho_compra")
  @GeneratedValue(generator = "carrinho", strategy = GenerationType.SEQUENCE)
  private int codigo;

  @OneToMany(mappedBy = "carrinho")
  private List<ItemCarrinho> itens;

  @OneToOne
  @JoinColumn(name = "cd_cliente", nullable = false)
  private Cliente cliente;

  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "dt_carrinho_compra")
  private Calendar data;

  @Column(name = "vl_valor_total", nullable = false)
  private double valorTotal;
}
