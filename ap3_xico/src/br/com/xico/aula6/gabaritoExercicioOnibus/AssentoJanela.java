package br.com.xico.aula6.gabaritoExercicioOnibus;

public class AssentoJanela extends Assento {

  TipoAssento tipo;

  public AssentoJanela(int numeroAssento) {
    super(numeroAssento);
    tipo = TipoAssento.JANELA;
  }

  @Override
  public String toString() {
    return "AssentoJanela [tipo=" + tipo + "]" + " é um: " + super.toString();
  }
}
