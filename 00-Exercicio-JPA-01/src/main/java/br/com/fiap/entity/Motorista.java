package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_EXE01_MOTORISTA")
public class Motorista {

  @Id
  @Column(name = "nr_carteira")
  private int carteira;

  @Column(name = "nm_motorista", nullable = false, length = 150)
  private String nome;

  @Temporal(TemporalType.DATE)
  @Column(name = "dt_nascimento")
  private Calendar dataNasc;

  @Lob
  @Column(name = "fl_carteira")
  private byte[] fotoCarteira;

  @Enumerated(EnumType.STRING)
  @Column(name = "ds_genero")
  private Genero genero;
}
