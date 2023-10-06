package br.com.xico.aula6.gabaritoExercicioOnibus;

import java.time.LocalDate;

public class Passageiro implements Cliente {

  private String nome;
  private String documento;
  private LocalDate dataNascimento;

  public Passageiro(String nome, String documento, LocalDate dataNascimento) {
    this.nome = nome;
    this.documento = documento;
    this.dataNascimento = dataNascimento;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getNome() {
    return nome;
  }

  @Override
  public String toString() {
    return "Passageiro [nome=" + nome + ", documento=" + documento + ", dataNascimento=" + dataNascimento + "]";
  }

}
