package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_LOCACAO")
@IdClass(LocacaoPK.class)
public class Locacao {

  @Id
  @Column(name="cd_locacao")
  @SequenceGenerator(name="seqLocacao", sequenceName="SEQ_CLIENTE", allocationSize=1)
  @GeneratedValue(generator="seqLocacao", strategy=GenerationType.SEQUENCE)
  private int codigo;

  @Id
  @ManyToOne
  @JoinColumn(name="cd_carro")
  private Carro carro;

  @Id
  @ManyToOne
  @JoinColumn(name="cd_cliente")
  private Cliente cliente;

  @Temporal(TemporalType.DATE)
  @Column(name="dt_locacao")
  private Calendar data;

  @Column(name="nr_dias")
  private int dias;

  public Locacao() {
    super();
  }

  public Locacao(Carro carro, Cliente cliente, Calendar data, int dias) {
    super();
    this.carro = carro;
    this.cliente = cliente;
    this.data = data;
    this.dias = dias;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public Carro getCarro() {
    return carro;
  }

  public void setCarro(Carro carro) {
    this.carro = carro;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Calendar getData() {
    return data;
  }

  public void setData(Calendar data) {
    this.data = data;
  }

  public int getDias() {
    return dias;
  }

  public void setDias(int dias) {
    this.dias = dias;
  }

}