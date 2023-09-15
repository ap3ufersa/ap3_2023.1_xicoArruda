package br.com.xico.aula6.gabaritoExercicioOnibus;

class Local {

  private String origem;
  private String destino;

  public Local(String origem, String destino) {
    this.origem = origem;
    this.destino = destino;
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

  @Override
  public String toString() {
    return "Local [origem=" + origem + ", destino=" + destino + "]";
  }
}
