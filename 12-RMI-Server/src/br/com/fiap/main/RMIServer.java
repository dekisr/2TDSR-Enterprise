package br.com.fiap.main;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.com.fiap.bo.OperacaoBO;
import br.com.fiap.bo.impl.OperacaoBOImpl;

public class RMIServer {
  public static void main(String[] args) throws Exception {
    OperacaoBO bo = new OperacaoBOImpl();
    // Publicar o objeto para o acesso remoto
    Registry registry = LocateRegistry.createRegistry(3002);
    System.out.println("Objeto remoto registrado!");
    registry.bind("banco", bo);
  }
}
