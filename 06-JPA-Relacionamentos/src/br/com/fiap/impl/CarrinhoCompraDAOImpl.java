package br.com.fiap.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.CarrinhoCompraDAO;
import br.com.fiap.entity.CarrinhoCompras;

public class CarrinhoCompraDAOImpl extends GenericDAOImpl<CarrinhoCompras, Integer> implements CarrinhoCompraDAO {

  public CarrinhoCompraDAOImpl(EntityManager em) {
    super(em);
  }

}
