package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.LocacaoDAO;
import br.com.fiap.entity.Locacao;
import br.com.fiap.entity.LocacaoPK;

public class LocacaoDAOImpl extends GenericDAOImpl<Locacao, LocacaoPK> implements LocacaoDAO {
  public LocacaoDAOImpl(EntityManager em) {
    super(em);
  }
}
