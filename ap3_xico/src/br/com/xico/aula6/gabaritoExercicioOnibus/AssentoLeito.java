package br.com.xico.aula6.gabaritoExercicioOnibus;

import java.io.Serializable;

public class AssentoLeito extends Assento implements Serializable {

  public boolean relaxaAsPerninhas;

  public AssentoLeito(int numeroAssento, TipoAssento tipo) {
    super(numeroAssento, tipo);
    relaxaAsPerninhas = true;
  }

  public boolean isRelaxaAsPerninhas() {
    return relaxaAsPerninhas;
  }

  public void setRelaxaAsPerninhas(boolean relaxaAsPerninhas) {
    this.relaxaAsPerninhas = relaxaAsPerninhas;
  }

  @Override
  public String toString() {
    return "AssentoLeito [relaxaAsPerninhas=" + relaxaAsPerninhas + "]";
  }
}
