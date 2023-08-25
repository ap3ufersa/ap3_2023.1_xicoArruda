package br.com.xico.aula5;

public class TestaPessoa {

  public static void main(String[] args) {
    System.out.println("Ola! Estou perdida no periodo!");

    Pessoa xico = new Pessoa();
    xico.setNome("Xico de Arruda");
    System.out.println(xico);
    System.out.println(xico.getNomeEmMinuscula());
    System.out.println(xico.getNomeEmMaiuscula());
  }
}
