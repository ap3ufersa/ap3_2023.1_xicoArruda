public class Threads {

  public static void main(String[] args) {
    // Thread atual
    Thread fioMain = Thread.currentThread();
    System.out.println(fioMain.getName());

    MeuRunnable meuRunnable = new MeuRunnable();

    Thread fio0 = new Thread(meuRunnable);
    fio0.run();

    //Usando notação lambda em Java
    //Thread fio1 = new Thread(() ->System.out.println(Thread.currentThread().getName()));
    //Thread fio2 = new Thread(meuRunnable);

    //fio0.start();
    //fio1.start();
    //fio2.start();
  }
}
