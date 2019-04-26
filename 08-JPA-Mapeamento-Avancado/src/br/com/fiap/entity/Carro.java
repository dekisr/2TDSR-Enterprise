package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CARRO")
@SequenceGenerator(name="seqCarro", sequenceName="SQ_T_CARRO", allocationSize=1)
public class Carro {
  
  @Id
  @Column(name="cd_carro")
  @GeneratedValue(generator="seqCarro", strategy=GenerationType.SEQUENCE)
  private int codigo;
  
  @Column(name="nr_placa")
  private String placa;
  
  @Column(name="ds_modelo")
  private String modelo;

  public Carro() {
    super();
  }

  public Carro(String placa, String modelo) {
    super();
    this.placa = placa;
    this.modelo = modelo;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  
}
