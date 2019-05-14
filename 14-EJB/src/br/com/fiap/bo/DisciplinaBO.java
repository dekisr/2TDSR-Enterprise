package br.com.fiap.bo;

import javax.ejb.Local;

@Local 
public interface DisciplinaBO {

  double calcularMedia(double nac, double ps, double am);
  
  boolean verificarStatus(double media);
  
  double calcularPS(double nac, double am);

  int calcularFaltas(int totalAulas);
  
}