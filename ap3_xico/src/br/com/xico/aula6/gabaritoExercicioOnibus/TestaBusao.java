package br.com.xico.aula6.gabaritoExercicioOnibus;

import java.time.LocalDate;

public class TestaBusao {

  public static void main(String[] args) {
    // Criando um passageiro
    Passageiro xico = new Passageiro(
      "Xico",
      "123456789",
      LocalDate.of(2000, 8, 25)
    );

    // Criando assentos
    Assento assentoXico = new Assento(1, TipoAssento.JANELA);

    // Criando uma viagem
    Viagem natalAngicos = new Viagem(
      1,
      "Natal",
      "Angicos",
      "2023-08-25 08:00",
      "2023-08-25 12:00"
    );

    // Listando todos os assentos antes da reserva
    System.out.println("\nTodos os assentos antes da reserva:");
    natalAngicos.getTodosOsAssentos().forEach(System.out::println);

    // Realizando uma reserva
    Reserva reserva = new Reserva(xico, natalAngicos, assentoXico);

    // Listando todos os assentos após a reserva
    System.out.println("\nTodos os assentos depois da reserva:");
    natalAngicos.getTodosOsAssentos().forEach(System.out::println);

    // Listando assentos disponíveis após a reserva
    //System.out.println("\nAssentos disponíveis após a reserva:");
    //natalAngicos.listarAssentosDisponiveis().forEach(System.out::println);

    // Exibindo a reserva
    //System.out.println("\nInformações da reserva:");
    //System.out.println(reserva);
  }
}
