package forExperts;

public class MultiThreadingEx {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        Thread thread2 = new Thread(new MyThread2());
        new Thread(()-> System.out.println("privet"));

        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());

        thread2.start();
        thread2.join();

        System.out.println("Konec");
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; ++i) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i >= 1; --i) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}