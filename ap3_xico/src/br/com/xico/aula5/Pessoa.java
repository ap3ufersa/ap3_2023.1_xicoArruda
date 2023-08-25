package br.com.xico.aula5;

public class Pessoa {

  // Crie uma classe chamada Pessoa com um atributo nome (private).
  // Forneça
  // métodos públicos GetNome e setNome para acessar e modificar o atributo.
  // Altere o toString para exibir o nome completo em
  // letras maiúsculas.
  private String nomeDaPessoa = "SemNome";

  public String getNome() {
    return nomeDaPessoa;
  }

  public String getNomeEmMaiuscula() {
    return nomeDaPessoa.toUpperCase();
  }

  public String getNomeEmMinuscula() {
    return nomeDaPessoa.toLowerCase();
  }

  public void setNome(String novoNomeDaPessoa) {
    this.nomeDaPessoa = novoNomeDaPessoa;
  }

  @Override
  public String toString() {
    return "Pessoa [nomeDaPessoa=" + getNomeEmMaiuscula() + "]";
  }
}
