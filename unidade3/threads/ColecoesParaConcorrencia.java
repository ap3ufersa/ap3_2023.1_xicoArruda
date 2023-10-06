import java.util.Map;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class ColecoesParaConcorrencia {

  //  private static List<String> lista = new CopyOnWriteArrayList<>();
  private static Map<Integer, String> mapa = new ConcurrentHashMap<>();
  private static BlockingQueue<String> fila = new LinkedBlockingQueue<>();

  public static void main(String[] args) throws InterruptedException {
    // Coleções que são Thread-safe

    MeuRunnable runnable = new MeuRunnable();
    Thread t0 = new Thread(runnable);
    Thread t1 = new Thread(runnable);
    Thread t2 = new Thread(runnable);
    t0.start();
    t1.start();
    t2.start();
    Thread.sleep(500);
    System.out.println("mapa:" + mapa);
    System.out.println("fila:" + fila);
  }

  public static class MeuRunnable implements Runnable {

    @Override
    public void run() {
      int numero = new Random().nextInt();
      mapa.put(numero, "adicionado no mapa.");
      fila.add(numero + " =adicionado na fila.");

      String name = Thread.currentThread().getName();
      System.out.println(name + " inseriu!");
    }
  }
}
