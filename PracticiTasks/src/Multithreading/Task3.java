package Multithreading;

//Одна из классических задач по многопоточности. Дано два потока — производитель и потребитель. Производитель
// генерирует некоторые данные (в примере — числа). Производитель «потребляет» их.
//Два потока разделяют общий буфер данных, размер которого ограничен. Если буфер пуст, потребитель должен ждать, пока
// там появятся данные. Если буфер заполнен полностью, производитель должен ждать, пока потребитель заберёт данные
// и место освободится.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Object lock = new Object();
        Queue<Integer> queue = new LinkedList<Integer>();

        Producer prod = new Producer(queue, 4);
        Consumer cons = new Consumer(queue);

        Thread prodThread = new Thread(prod);
        Thread consThread = new Thread(cons);
        prodThread.start();
        consThread.start();
    }
}

class Producer implements Runnable {
    Queue<Integer> que;
    int size;

    public Producer(Queue<Integer> que, int size) {
        this.que = que;
        this.size = size;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            synchronized (que) {
                try {
                    if (que.size() == size) {

                        que.wait();
                    }

                    Integer cur = random.nextInt(100);
                    que.add(cur);
                    que.notify();
                    System.out.println("Producer: " + cur);
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

class Consumer implements Runnable {
    Queue<Integer> que;

    public Consumer(Queue<Integer> que) {
        this.que = que;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (que) {
                try {
                    if (que.isEmpty()) {
                        que.wait();
                    }

                    Integer cur = que.poll();
                    que.notify();
                    System.out.println("Consumer: " + cur);
                    Thread.sleep(2000);


                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}