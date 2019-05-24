package br.com.fiap.view;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.fiap.bo.DisciplinaBO;

public class View {

	public static void main(String[] args) throws Exception {
		
		//chamar o EJB de forma remota
		Properties prop = new Properties();
		prop.put(Context.URL_PKG_PREFIXES,
							"org.jboss.ejb.client.naming");
		
		Context context = new InitialContext(prop);
		
		DisciplinaBO bo = (DisciplinaBO)
				context.lookup("ejb:/14-EJB/DisciplinaBOImpl!br.com.fiap.bo.DisciplinaBO");
		
		System.out.println(bo.calcularFaltas(80));
		
	}
	
}
