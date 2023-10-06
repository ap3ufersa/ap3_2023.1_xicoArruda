public class MeuRunnable implements Runnable {
    
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
    
}