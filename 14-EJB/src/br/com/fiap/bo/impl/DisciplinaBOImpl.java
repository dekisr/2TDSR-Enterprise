package br.com.fiap.bo.impl;

import javax.ejb.Stateless;
import br.com.fiap.bo.DisciplinaBO;

@Stateless
public class DisciplinaBOImpl implements DisciplinaBO {

	@Override
	public double calcularMedia(double nac, double ps, double am) {
		return nac * 0.2 + ps * 0.5 + am * 0.3;
	}

	@Override
	public boolean verificarStatus(double media) {
		return media >= 6;
	}

	@Override
	public double calcularPS(double nac, double am) {
		return  (6 - (nac * 0.2 + am * 0.3))*2;
	}

	@Override
	public int calcularFaltas(int totalAulas) {
		return Math.round(totalAulas*0.25f);
	}
	
}



