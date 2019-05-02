package br.com.fiap.teste;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Calendar;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.ConsultaDAO;
import br.com.fiap.dao.PessoaDAO;
import br.com.fiap.dao.impl.ConsultaDAOImpl;
import br.com.fiap.dao.impl.PessoaDAOImpl;
import br.com.fiap.entity.Consulta;
import br.com.fiap.entity.Medico;
import br.com.fiap.entity.Paciente;
import br.com.fiap.entity.Pessoa;
import br.com.fiap.entity.PessoaFisica;
import br.com.fiap.entity.PessoaJuridica;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

class Teste {

	private static ConsultaDAO dao;
	
	private static PessoaDAO pDao;
	
	@BeforeAll
	public static void init() {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		dao = new ConsultaDAOImpl(em);
		pDao = new PessoaDAOImpl(em);
	}
	
	@Test
	void herancaTest() {
		//cadastrar as 3 pessoas
		Pessoa pessoa = new Pessoa("Sergio");
		PessoaFisica pf = new PessoaFisica("Sergio PF", "546.464.546-87", Calendar.getInstance());
		PessoaJuridica pj = new PessoaJuridica("Sergio produções Ltda", "12.321.321/0001-56", Calendar.getInstance());
		
		pDao.cadastrar(pessoa);
		pDao.cadastrar(pj);
		pDao.cadastrar(pf);
		try {
			pDao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	void cadastraTudoTest() {
		Medico medico = new Medico(123, "Drauzio", "Clinico", 1000, 54654);
		Paciente paciente = new Paciente("Sergio");
		Consulta consulta = new Consulta(medico, paciente, 
					Calendar.getInstance(), "Nada");
		
		try {
			dao.cadastrar(consulta);
			dao.commit();
		} catch (CommitException e) {
			fail("Errou");
			e.printStackTrace();
		}
		
	}

}






