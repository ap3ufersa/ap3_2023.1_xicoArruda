package br.com.xico.aula6.gabaritoExercicioOnibus;

import java.time.LocalDate;

public interface Cliente {
  public String getNome();
  public String getDocumento();
  public LocalDate getDataNascimento();
}
