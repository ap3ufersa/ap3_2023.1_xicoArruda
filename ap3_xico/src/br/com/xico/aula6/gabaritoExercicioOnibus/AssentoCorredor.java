package br.com.xico.aula6.gabaritoExercicioOnibus;

public class AssentoCorredor extends Assento {

  TipoAssento tipo;

  public AssentoCorredor(int numeroAssento) {
    super(numeroAssento);
    tipo = TipoAssento.CORREDOR;
  }

  @Override
  public String toString() {
    return "AssentoCorredor [tipo=" + tipo + "]" + " é um: " + super.toString();
  }
}
