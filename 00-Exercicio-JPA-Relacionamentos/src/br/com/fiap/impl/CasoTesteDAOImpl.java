package br.com.fiap.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.CasoTesteDAO;
import br.com.fiap.entity.CasoTeste;

public class CasoTesteDAOImpl extends GenericDAOImpl<CasoTeste, Integer> implements CasoTesteDAO {

  public CasoTesteDAOImpl(EntityManager em) {
    super(em);
  }

}
