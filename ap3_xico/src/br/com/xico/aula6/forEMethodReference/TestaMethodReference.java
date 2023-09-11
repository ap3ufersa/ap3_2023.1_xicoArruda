package br.com.xico.aula6.forEMethodReference;

import java.util.List;

public class TestaMethodReference {

  public static void main(String[] args) {
    List<Integer> numeros = List.of(1, 2, 3, 4, 5);

    System.out.println("Usando System.out::println:");
    numeros.forEach(System.out::println);
  }
}




