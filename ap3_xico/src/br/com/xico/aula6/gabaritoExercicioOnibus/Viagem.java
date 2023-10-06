package br.com.xico.aula6.gabaritoExercicioOnibus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Viagem {

  private int numeroViagem;
  private Local localViagem;
  private LocalDateTime dataHoraPartida;
  private LocalDateTime dataHoraChegada;
  private List<Assento> todosOsAssentos;

  public Viagem(
      int numeroViagem,
      String origem,
      String destino,
      LocalDateTime dataHoraPartida,
      LocalDateTime dataHoraChegada) {
    this.localViagem = new Local(origem, destino);
    this.numeroViagem = numeroViagem;
    this.dataHoraPartida = dataHoraPartida;
    this.dataHoraChegada = dataHoraChegada;
    this.todosOsAssentos = new ArrayList<>();
    for (int i = 1; i <= 20; i = i + 2) {
      todosOsAssentos.add(new AssentoJanela(i));
      todosOsAssentos.add(new AssentoCorredor(i + 1));
    }
  }

  public List<Assento> listarAssentosDisponiveis() {
    List<Assento> disponiveis = new ArrayList<>();
    for (Assento assento : todosOsAssentos) {
      if (assento.isDisponivel()) {
        disponiveis.add(assento);
      }
    }
    return disponiveis;
  }

  public void realizarReserva(Assento assentoReservado) {
    for (Assento umAssento : todosOsAssentos) {
      if (umAssento.getNumeroAssento() == assentoReservado.getNumeroAssento()) {
        if (umAssento.isDisponivel()) {
          umAssento.setDisponivel(false);
          break;
        }
      }
    }
  }

  public int getNumeroViagem() {
    return numeroViagem;
  }

  public void setNumeroViagem(int numeroViagem) {
    this.numeroViagem = numeroViagem;
  }

  public Local getLocalViagem() {
    return localViagem;
  }

  public void setLocalViagem(Local localViagem) {
    this.localViagem = localViagem;
  }

  public LocalDateTime getDataHoraPartida() {
    return dataHoraPartida;
  }

  public void setDataHoraPartida(LocalDateTime dataHoraPartida) {
    this.dataHoraPartida = dataHoraPartida;
  }

  public LocalDateTime getDataHoraChegada() {
    return dataHoraChegada;
  }

  public void setDataHoraChegada(LocalDateTime dataHoraChegada) {
    this.dataHoraChegada = dataHoraChegada;
  }

  public List<Assento> getTodosOsAssentos() {
    return todosOsAssentos;
  }

  public void setTodosOsAssentos(List<Assento> todosOsAssentos) {
    this.todosOsAssentos = todosOsAssentos;
  }

  @Override
  public String toString() {
    return ("Viagem [numeroViagem=" +
        numeroViagem +
        ", localViagem=" +
        localViagem +
        ", dataHoraPartida=" +
        dataHoraPartida +
        ", dataHoraChegada=" +
        dataHoraChegada +
        ", todosOsAssentos=" +
        todosOsAssentos +
        "]");
  }
}
