package br.com.xico.aula6.gabaritoExercicioOnibus;

import java.time.LocalDate;

public class Passageiro {

  private String nome;
  private String documento;
  private LocalDate dataNascimento;

  public Passageiro(String nome, String documento, LocalDate dataNascimento) {
    this.nome = nome;
    this.documento = documento;
    this.dataNascimento = dataNascimento;
  }
}
