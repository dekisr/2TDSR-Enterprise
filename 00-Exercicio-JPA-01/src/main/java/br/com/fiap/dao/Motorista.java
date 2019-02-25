package br.com.fiap.dao;

public interface Motorista {
  void cadastrar(Motorista motorista);
  void deletar(int codigo);
  void atualizar(Motorista motorista);
  void buscar(int codigo);
}
