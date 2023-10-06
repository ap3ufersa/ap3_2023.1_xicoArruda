public class Synchronized_1 {

  static int i = -1;

  public static void main(String[] args) {
    MeuRunnable runnable = new MeuRunnable();

    //    for (int i = 0; i < 5; i++) {
    //      runnable.run();
    //    }

    Thread t0 = new Thread(runnable);
    Thread t1 = new Thread(runnable);
    Thread t2 = new Thread(runnable);
    Thread t3 = new Thread(runnable);
    Thread t4 = new Thread(runnable);

    t0.start();
    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}
