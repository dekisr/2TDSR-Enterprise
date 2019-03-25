package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_ITEM_TESTE")
@SequenceGenerator(name = "itemTeste", sequenceName = "SEQ_TAB_ITEM_TESTE", allocationSize = 1)
public class ItemTeste {
  
  @Id
  @Column(name="cd_itemTeste")
  @GeneratedValue(generator="itemTeste", strategy = GenerationType.SEQUENCE)
  private int codigo;
  
  @Column(name="ds_itemTeste")
  private String descricao;

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

}
