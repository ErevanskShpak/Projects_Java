public class Main implements Runnable{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Main(), "Thread 1");
        Thread t2 = new Thread(new Main(), "Thread 2");

        t1.start();
        t2.start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            // Yield control to other threads
            Thread.yield();
        }
    }
}