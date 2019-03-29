package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_CASO_TESTE")
@SequenceGenerator(name = "casoTeste", sequenceName = "SEQ_TAB_CASO_TESTE", allocationSize = 1)
public class CasoTeste {

  @Id
  @Column(name = "cd_casoTeste")
  @GeneratedValue(generator = "casoTeste", strategy = GenerationType.SEQUENCE)
  private int codigo;

  @Column(name = "nm_casoTeste", length = 50)
  private String nome;

  @Column(name = "ds_casoTeste")
  private String descricao;

  @ManyToOne
  @JoinColumn(name = "cd_sistema", nullable = false)
  private Sistema sistema;
  
  @OneToMany(mappedBy="casoTeste")
  private List<ItemTeste> itemTeste = new ArrayList<>();

  public CasoTeste() {
    super();
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

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

}
