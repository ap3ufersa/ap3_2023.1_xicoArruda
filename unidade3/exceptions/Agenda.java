public class Agenda {

  private AgendaContato[] contatos;

  public Agenda() {
    contatos = new AgendaContato[5];
  }

  public void adicionarContato(AgendaContato c) throws AgendaCheiaExeption {
    boolean cheia = true;
    for (int i = 0; i < contatos.length; i++) {
      if (contatos[i] == null) {
        contatos[i] = c;
        cheia = false;
        break;
      }
    }

    if (cheia) {
      throw new AgendaCheiaExeption();
    }
  }

  public int consultaContatoPorNome(String nome)
    throws AgendaContatoNaoExisteException {
    for (int i = 0; i < contatos.length; i++) {
      if (contatos[i] != null) {
        if (contatos[i].getNome().equalsIgnoreCase(nome)) {
          return i;
        }
      }
    }
    throw new AgendaContatoNaoExisteException(nome);
  }

  @Override
  public String toString() {
    String s = "";
    for (AgendaContato c : contatos) {
      if (c != null) {
        s += c.toString() + "\n";
      }
    }
    return s;
  }
}
