public class Threads {

  public static void main(String[] args) {
    // Thread atual
    Thread fioMain = Thread.currentThread();
    String nome = fioMain.getName();
    System.out.println(nome);

    MeuRunnable meuRunnable = new MeuRunnable();

    Thread fio0 = new Thread(meuRunnable);
    Thread fio1 = new Thread(() ->
      System.out.println(Thread.currentThread().getName())
    );
    Thread fio2 = new Thread(meuRunnable);
    Thread fio3 = new Thread(meuRunnable);

    fio0.start();
    fio1.start();
    fio2.start();
    fio3.start();
  }
}
