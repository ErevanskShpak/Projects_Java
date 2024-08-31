package Multithreading;

//Напишите программу, в которой создаются два потока, которые выводят на консоль своё имя по очереди.

public class Task2 {
    public static void main(String[] args) {
        Object lock = new Object();

        new MyThread(lock, "Dave").start();
        new MyThread(lock,"The Diver").start();
        new MyThread(lock, "Kurva").start();
    }

}

class MyThread extends Thread {
    private Object lock;
    private String name;

    public MyThread(Object lock, String name) {
        this.lock = lock;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
                synchronized (lock) {
                    try {
                        System.out.println(name);
                        lock.notifyAll();
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        }
    }
}
