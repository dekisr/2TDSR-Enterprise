package br.com.fiap.main;

import java.rmi.Naming;

import br.com.fiap.bo.OperacaoBO;

public class RMIClient {
  public static void main(String[] args) throws Exception {
    // Recuperar o objeto para acessar os métodos remotos (Projeto 12)
    OperacaoBO bo = (OperacaoBO) Naming.lookup("rmi://localhost:3002/banco");
    int fatorial = bo.fatorial(5);
    System.out.println("Fatorial: " + fatorial);
    double raiz = bo.raiz(9);
    System.out.println("Raiz: " + raiz);
  }
}
