package br.com.fiap.bo.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import br.com.fiap.bo.OperacaoBO;

public class OperacaoBOImpl extends UnicastRemoteObject implements OperacaoBO {

  public OperacaoBOImpl() throws RemoteException {
    super();
  }

  @Override
  public int fatorial(int x) throws RemoteException {
    System.out.println("Fatorando...");
    return x==1?1:fatorial(x-1)*x;
  }

  @Override
  public double raiz(int x) throws RemoteException {
    System.out.println("Raizando...");
    return Math.sqrt(x);
  }

}
