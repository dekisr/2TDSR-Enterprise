package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente, Integer> {
  
  List<Cliente> listar();

  List<Cliente> buscarPorParteDoNome(String parte);

  List<Cliente> buscarPorEstado(String estado);

  List<Cliente> buscarQuantidadeDiasReservado(int dias);

  List<Cliente> buscar(String nome, String cidade);
  
  List<Cliente> buscarPorEstados(List<String> estados);
  
  long contarPorEstado(String estado);
  
}
