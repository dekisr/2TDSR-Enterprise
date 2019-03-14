package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

  // 1 - Atributo est�tico que ser� �nico
  private static EntityManagerFactory emf;

  // 2 - Construtor vazio e privado
  private EntityManagerFactorySingleton() {
  };

  // 3 - M�todo est�tico que retorna a �nica inst�ncia
  public static EntityManagerFactory getInstance() {
    if (emf == null) {
      emf = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
    }
    return emf;
  }

}
