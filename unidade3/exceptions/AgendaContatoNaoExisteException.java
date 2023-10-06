public class AgendaContatoNaoExisteException extends Exception {

  private String nomeContato;

  public AgendaContatoNaoExisteException(String nomeContato) {
    this.nomeContato = nomeContato;
  }

  @Override
  public String getMessage() {
    return "Contato " + nomeContato + " não existe na agenda!";
  }
}
