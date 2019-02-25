package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "T_EXE01_VEICULO")
@SequenceGenerator(name = "veiculo", sequenceName = "SQ_T_EXE01_VEICULO", allocationSize = 1)
public class Veiculo {
  
  @Id
  @Column (name = "cd_veiculo")
  @GeneratedValue(generator = "veiculo", strategy = GenerationType.SEQUENCE)
  private int codigo;
  
  @Column (name = "ds_placa", nullable = false, length = 9)
  private String placa;
  
  @Column (name = "ds_cor", nullable = false, length = 20)
  private String cor;
  
  @Column (name = "nr_ano")
  private int ano;
}
