package br.com.fiap.revisao.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.revisao.bean.Carro;
import br.com.fiap.revisao.bean.Categoria;

public class Teste {
	public static void main(String[] args) {
		//Instanciar um Carro
		Carro carroTeste = new Carro("Nome Teste");
		//Atribuir um valor
		carroTeste.setCor("Cor Teste");
		carroTeste.setCategoria(Categoria.HATCH_ESPORTIVO);
		//Atribuir um valor para a data de fabrição
		Calendar data = Calendar.getInstance(); //Data atual
		Calendar data2 = new GregorianCalendar(2010,Calendar.JANUARY,1); // mês começa no 0
		carroTeste.setDataFabricacao(data2);
		//Exibir a data de fabricação
		//Objeto para formatar a data
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatador.format(carroTeste.getDataFabricacao().getTime()));
		//testar se a categoria é A
		if(carroTeste.getCategoria() == Categoria.A) {
			System.out.println("Categoria A");
		} else  {
			System.out.println("no");
		}
		
//		String teste = "";
//		String teste2 = "";
//		if (teste == teste2) {
//			System.out.println("Entrou");
//		}
	}
}