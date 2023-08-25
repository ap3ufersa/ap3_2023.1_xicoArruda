package br.com.xico.aula6.gabaritoExercicioOnibus;

public class Assento {

  private int numeroAssento;
  private TipoAssento tipo;
  private boolean disponivel;

  public Assento(int numeroAssento, TipoAssento tipo) {
    this.numeroAssento = numeroAssento;
    this.tipo = tipo;
    this.disponivel = true;
  }

  public void marcarIndisponivel() {
    this.disponivel = false;
  }

  public int getNumeroAssento() {
    return numeroAssento;
  }

  public void setNumeroAssento(int numeroAssento) {
    this.numeroAssento = numeroAssento;
  }

  public TipoAssento getTipo() {
    return tipo;
  }

  public void setTipo(TipoAssento tipo) {
    this.tipo = tipo;
  }

  public boolean isDisponivel() {
    return disponivel;
  }

  public void setDisponivel(boolean disponivel) {
    this.disponivel = disponivel;
  }

  @Override
  public String toString() {
    return "Assento [numeroAssento=" + numeroAssento + ", tipo=" + tipo + ", disponivel=" + disponivel + "]";
  }
}
