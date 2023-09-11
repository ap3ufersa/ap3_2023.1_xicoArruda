package br.com.xico.aula6.forEMethodReference;

import java.util.List;

public class TestaFor {

  public static void main(String[] args) {
    List<Integer> numeros = List.of(17, 62, 53, 4, 5);

    System.out.println("Usando loop for:");

    for (int i = 0; i < numeros.size(); i++)
      System.out.println(numeros.get(i));

  }
}
