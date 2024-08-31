package forExperts.SynchCollections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<Integer> lst = new CopyOnWriteArrayList<>();
        lst.add(11);
        lst.add(10);

        Runnable func = () -> {
            Iterator<Integer> it = lst.iterator();
            while(it.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(it.next());
            }
        };

        Runnable func2 = () -> {
            lst.remove(1);
        };

        Thread thread1 = new Thread(func);
        thread1.start();
        Thread thread2 = new Thread(func2);
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(lst);
    }
}
