package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

  // 1 - Atributo estático que será único
  private static EntityManagerFactory emf;

  // 2 - Construtor vazio e privado
  private EntityManagerFactorySingleton() {
  };

  // 3 - Método estático que retorna a única instância
  public static EntityManagerFactory getInstance() {
    if (emf == null) {
      emf = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
    }
    return emf;
  }

}
