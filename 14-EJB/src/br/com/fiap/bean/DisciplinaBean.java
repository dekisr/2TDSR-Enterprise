package br.com.fiap.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import br.com.fiap.bo.DisciplinaBO;

@ManagedBean
public class DisciplinaBean {

	private double nac, am, ps, media;
	
	private int aulas, faltas;
	
	private boolean passou;
	
	@EJB
	private DisciplinaBO bo;
	
	public void calcular() {
		media = bo.calcularMedia(nac, ps, am);
		passou = bo.verificarStatus(media);
	}
	
	public void calcularPS() {
		ps = bo.calcularPS(nac, am);
	}
	
	public void calcularFaltas() {
		faltas = bo.calcularFaltas(aulas);
	}

	public double getNac() {
		return nac;
	}

	public void setNac(double nac) {
		this.nac = nac;
	}

	public double getAm() {
		return am;
	}

	public void setAm(double am) {
		this.am = am;
	}

	public double getPs() {
		return ps;
	}

	public void setPs(double ps) {
		this.ps = ps;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public boolean isPassou() {
		return passou;
	}

	public void setPassou(boolean passou) {
		this.passou = passou;
	}

	public int getAulas() {
		return aulas;
	}

	public void setAulas(int aulas) {
		this.aulas = aulas;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
}