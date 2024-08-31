package Multithreading;

//Выведите состояние потока перед его запуском​, после запуска и во время выполнения.

public class Task1 {
    public static void main(String[] strings) throws InterruptedException {
        Object lock = new Object();

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {

                    synchronized (lock) {
                        System.out.println("Privet5");
                        lock.notifyAll();
                        System.out.println("Privaet");
                        lock.wait();
                        System.out.println(getState());
                        System.out.println("Privet4");
                    }
                    for (int i=0; i< 10; i++) {
                        System.out.println("Privet2");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        synchronized (lock){
            thread.start(); // Запустим поток
            System.out.println("Privet0");
            lock.wait(); // Будем ждать, пока поток не запустится
            System.out.println("Privet3");
            System.out.println(thread.getState()); // WAITING
            lock.notifyAll();
            System.out.println(thread.getState()); // BLOCKED
            System.out.println("Privet7");
        }
        for (int i=0; i< 10; i++) {
            System.out.println("Privet6");
        }


    }


}
