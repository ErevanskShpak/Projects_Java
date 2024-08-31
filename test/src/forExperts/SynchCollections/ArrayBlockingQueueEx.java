package forExperts.SynchCollections;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Integer> arr = new ArrayBlockingQueue<>(4);

        new Thread(()->{
            int i =0;
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    arr.put(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("add " + i++ +" "+ arr);
            }
        }).start();

        new Thread(()-> {
            while (true) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = null;
                try {
                    i = arr.take();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("take " + i + " " + arr);
            }
        }).start();

    }
}
