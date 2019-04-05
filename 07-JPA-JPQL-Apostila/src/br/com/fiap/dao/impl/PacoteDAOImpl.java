package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class PacoteDAOImpl extends GenericDAOImpl<Pacote, Integer> implements PacoteDAO {

	public PacoteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Pacote> listarPorTransporte(Transporte transporte) {
		// Criar a TypedQuery
		TypedQuery<Pacote> query =
				em.createQuery("from Pacote p where p.transporte = :t", Pacote.class);

		// Setar o par�metro da Query
		query.setParameter("t", transporte);

		// Executar a TypedQuery
		return query.getResultList();
	}

}
