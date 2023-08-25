package br.com.xico.aula5.gabaritoExercicioOnibus;

import java.time.LocalDate;

public class TestaBusao {
    public static void main(String[] args) {
        // Criando um passageiro
        Passageiro xico = new Passageiro("Xico", "123456789", LocalDate.of(2000, 8, 25));

        // Criando assentos
        Assento assentoJanela = new Assento(1, TipoAssento.JANELA);
        Assento assentoCorredor = new Assento(21, TipoAssento.CORREDOR);

        // Criando uma viagem
        Viagem natalAngicos = new Viagem(1, "Natal", "Angicos", "2023-08-25 08:00", "2023-08-25 12:00");

        // Listando assentos disponíveis antes da reserva
        System.out.println("Assentos disponíveis antes da reserva:");
        viagem.listarAssentosDisponiveis().forEach(System.out::println);

        // Realizando uma reserva
        Reserva reserva = new Reserva(xico, natalAngicos, assentoJanela);

        // Exibindo informações da reserva
        System.out.println("\nInformações da reserva:");
        System.out.println(reserva);

        // Listando assentos disponíveis após a reserva
        System.out.println("\nAssentos disponíveis após a reserva:");
        viagem.listarAssentosDisponiveis().forEach(System.out::println);
      
    }
}
