package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente,Integer> implements ClienteDAO{

	public ClienteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Cliente> listar() {
		//Criar a Query
		TypedQuery<Cliente> query = 
				em.createQuery("from Cliente",Cliente.class);
		//Executar a Query
		return query.getResultList();
	}

	@Override
	public List<Cliente> buscarPorParteDoNome(String parte) {
		//Criar a Query
		TypedQuery<Cliente> query = 
				em.createQuery("from Cliente c where c.nome like :p", Cliente.class);
		
		//Setar parâmetro
		query.setParameter("p", "%"+parte+"%");
		
		//Executar a TypedQuery
		return query.getResultList();
	}

	@Override
	public List<Cliente> buscarPorEstado(String estado) {
		TypedQuery<Cliente> query = 
				em.createQuery("from Cliente c where c.endereco.cidade.uf like :e", Cliente.class);
		query.setParameter("e", estado);
		return query.getResultList();
	}

}
