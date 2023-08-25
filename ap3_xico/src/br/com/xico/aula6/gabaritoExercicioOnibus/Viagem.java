package br.com.xico.aula6.gabaritoExercicioOnibus;

import java.util.ArrayList;
import java.util.List;

public class Viagem {

  private int numeroViagem;
  private String origem;
  private String destino;
  private String dataHoraPartida;
  private String dataHoraChegada;
  private List<Assento> todosOsAssentos;

  public Viagem(
      int numeroViagem,
      String origem,
      String destino,
      String dataHoraPartida,
      String dataHoraChegada) {
    this.numeroViagem = numeroViagem;
    this.origem = origem;
    this.destino = destino;
    this.dataHoraPartida = dataHoraPartida;
    this.dataHoraChegada = dataHoraChegada;
    this.todosOsAssentos = new ArrayList<>();
    for (int i = 1; i <= 20; i++)
      todosOsAssentos.add(new Assento(i, TipoAssento.JANELA));

    for (int i = 1; i <= 20; i++)
      todosOsAssentos.add(new Assento(i + 20, TipoAssento.CORREDOR));
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
    for (Assento umAssento : todosOsAssentos)
      if (umAssento.getNumeroAssento() == assentoReservado.getNumeroAssento()) {
        umAssento.setDisponivel(false);
        break;
      }
  }

  public int getNumeroViagem() {
    return numeroViagem;
  }

  public void setNumeroViagem(int numeroViagem) {
    this.numeroViagem = numeroViagem;
  }

  public String getOrigem() {
    return origem;
  }

  public void setOrigem(String origem) {
    this.origem = origem;
  }

  public String getDestino() {
    return destino;
  }

  public void setDestino(String destino) {
    this.destino = destino;
  }

  public String getDataHoraPartida() {
    return dataHoraPartida;
  }

  public void setDataHoraPartida(String dataHoraPartida) {
    this.dataHoraPartida = dataHoraPartida;
  }

  public String getDataHoraChegada() {
    return dataHoraChegada;
  }

  public void setDataHoraChegada(String dataHoraChegada) {
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
    return "Viagem [numeroViagem=" + numeroViagem + ", origem=" + origem + ", destino=" + destino + ", dataHoraPartida="
        + dataHoraPartida + ", dataHoraChegada=" + dataHoraChegada + ", assentos=" + todosOsAssentos + "]";
  }
}
