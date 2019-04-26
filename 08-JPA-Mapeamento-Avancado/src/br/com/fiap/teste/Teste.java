package br.com.fiap.teste;

import static org.junit.Assert.fail;

import java.util.Calendar;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.LocacaoDAO;
import br.com.fiap.dao.impl.LocacaoDAOImpl;
import br.com.fiap.entity.Carro;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Locacao;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

class Teste {

  private static LocacaoDAO dao;
  
  @BeforeAll
  public static void init() {
    EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
    dao = new LocacaoDAOImpl(em);
  }

  @Test
  void cadastrarTudoTest() {
    Cliente cliente = new Cliente("Cerjo", 565656565655612l);
    Carro carro = new Carro("ABC-8985", "BMW X1");
    Locacao locacao = new Locacao(carro, cliente, Calendar.getInstance(), 20);
    try {
      dao.cadastrar(locacao);
      dao.commit();
    } catch (CommitException e) {
      fail("Erro");
      e.printStackTrace();
    }
  }

}
