package br.com.xico.aula5.gabaritoExercicioOnibus;

import java.util.ArrayList;
import java.util.List;

public class Viagem {

  private int numeroViagem;
  private String origem;
  private String destino;
  private String dataHoraPartida;
  private String dataHoraChegada;
  private List<Assento> assentos;

  public Viagem(
    int numeroViagem,
    String origem,
    String destino,
    String dataHoraPartida,
    String dataHoraChegada
  ) {
    this.numeroViagem = numeroViagem;
    this.origem = origem;
    this.destino = destino;
    this.dataHoraPartida = dataHoraPartida;
    this.dataHoraChegada = dataHoraChegada;
    this.assentos = new ArrayList<>();
    for (int i = 1; i <= 20; i++) {
      assentos.add(new Assento(i, TipoAssento.JANELA));
      assentos.add(new Assento(i + 20, TipoAssento.CORREDOR));
    }
  }

  public List<Assento> listarAssentosDisponiveis() {
    List<Assento> assentosDisponiveis = new ArrayList<>();
    for (Assento assento : assentos) {
      if (assento.isDisponivel()) {
        assentosDisponiveis.add(assento);
      }
    }
    return assentosDisponiveis;
  }

  public void realizarReserva(Assento assento) {
    assento.marcarIndisponivel();
  }
}
