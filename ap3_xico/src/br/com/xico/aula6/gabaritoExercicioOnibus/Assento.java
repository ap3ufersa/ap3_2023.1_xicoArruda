package br.com.xico.aula6.gabaritoExercicioOnibus;

public class Assento {

  private int numeroAssento;
  private boolean disponivel;

  public Assento(int numeroAssento) {
    this.numeroAssento = numeroAssento;
    this.disponivel = true;
  }

  public int getNumeroAssento() {
    return numeroAssento;
  }

  public void setNumeroAssento(int numeroAssento) {
    this.numeroAssento = numeroAssento;
  }

  public boolean isDisponivel() {
    return disponivel;
  }

  public void setDisponivel(boolean disponivel) {
    this.disponivel = disponivel;
  }

  @Override
  public String toString() {
    return "Assento [num=" + numeroAssento + ", disponivel=" + disponivel + "]";
  }
}
