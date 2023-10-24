import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

public class SequencialOuParalelo {

  public static Duration paralelo(int quantNumeros) {
    Instant inicio = Instant.now();
    Map<Double, Double> mapa = new ConcurrentHashMap<>();
    IntStream
      .range(1, quantNumeros)
      .parallel()
      .mapToDouble(numero -> Math.pow(numero, 5))
      .filter(numero -> numero % 2 == 0)
      .forEach(numero -> mapa.put(numero, Math.pow(numero, 5)));
    Instant fim = Instant.now();
    return Duration.between(inicio, fim);
  }

  public static Duration sequencial(int quantNumeros) {
    Instant inicio = Instant.now();
    Map<Double, Double> mapa = new HashMap<>();
    IntStream
      .range(1, quantNumeros)
      .mapToDouble(numero -> Math.pow(numero, 5))
      .filter(numero -> numero % 2 == 0)
      .forEach(numero -> mapa.put(numero, Math.pow(numero, 5)));
    Instant fim = Instant.now();
    return Duration.between(inicio, fim);
  }

  public static void main(String[] args) {
    System.out.println("Saida Formato ISO8601");

    int quantNumeros = 7000000; // mude aqui!
    System.out.println("Duracao - Sequencial=" + sequencial(quantNumeros));
    System.out.println("Duracao - Paralelo=" + paralelo(quantNumeros));
  }
}
