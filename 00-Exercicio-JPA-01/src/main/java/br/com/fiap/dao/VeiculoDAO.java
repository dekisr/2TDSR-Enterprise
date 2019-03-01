package br.com.fiap.dao;

import br.com.fiap.entity.Veiculo;

public interface VeiculoDAO {
  void cadastrar(Veiculo veiculo);

  void deletar(int codigo);

  void atualizar(Veiculo veiculo);

  void buscar(int codigo);
}
