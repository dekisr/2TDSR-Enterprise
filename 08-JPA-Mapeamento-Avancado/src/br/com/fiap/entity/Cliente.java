package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CLIENTE")
@SequenceGenerator(name="seqCliente", sequenceName="SQ_T_CLIENTE", allocationSize=1)
public class Cliente {

  @Id
  @Column(name="cd_cliente")
  @GeneratedValue(generator="seqCliente", strategy=GenerationType.SEQUENCE)
  private int codigo;

  @Column(name="nm_cliente")
  private String nome;

  @Column(name="nr_cnh")
  private long cnh;
  
  

  public Cliente() {
    super();
  }

  public Cliente(String nome, long cnh) {
    super();
    this.nome = nome;
    this.cnh = cnh;
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

  public long getCnh() {
    return cnh;
  }

  public void setCnh(long cnh) {
    this.cnh = cnh;
  }

}
