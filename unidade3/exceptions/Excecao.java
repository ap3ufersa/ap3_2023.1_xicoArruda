public class Excecao {

  public static void main(String[] args) {
    try {
      int[] vetor = { 50, 13, 27, 57 };
      System.out.println("Antes da exception");
      vetor[20] = 345;
      System.out.println("Esse texto não será impresso");
    } catch (ArrayIndexOutOfBoundsException aid) {
      System.out.println("Tentou acessar uma posicao invalida!");
      aid.printStackTrace();
    }
  }
}
