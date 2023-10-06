package br.com.xico.aula6.gabaritoExercicioOnibus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestaBusao {

  public static void main(String[] args) {
    // Criando um passageiro
    Passageiro xico = new Passageiro("Xico", "123456789", LocalDate.of(2000, 8, 25));

    // Criando o assento
    Assento assentoXico = new AssentoJanela(1);
    Assento assentoWellington = new AssentoCorredor(2);

    // Criando uma viagem
    LocalDateTime partida = LocalDateTime.of(2023, 9, 15, 10, 0);
    LocalDateTime chegada = LocalDateTime.of(2023, 9, 15, 14, 10);

    Viagem natalAngicos = new Viagem(1, "Natal", "Angicos", partida, chegada);

    // Listando todos os assentos antes da reserva
    System.out.println("\nTodos os assentos antes da reserva:");
    natalAngicos.getTodosOsAssentos().forEach(System.out::println);

    // Realizando uma reserva
    Reserva reservaXico = new Reserva(xico, natalAngicos, assentoXico);
    Reserva reservaWellington = new Reserva(xico, natalAngicos, assentoWellington);

    // Listando todos os assentos após a reserva
    System.out.println("\nTodos os assentos depois da reserva:");
    natalAngicos.getTodosOsAssentos().forEach(System.out::println);

    // Listando assentos disponíveis após a reserva
    // System.out.println("\nAssentos disponíveis após a reserva:");
    // natalAngicos.listarAssentosDisponiveis().forEach(System.out::println);

    // Exibindo a reserva
    // System.out.println("\nInformações da reserva:");
    // System.out.println(reserva);
  }
}
