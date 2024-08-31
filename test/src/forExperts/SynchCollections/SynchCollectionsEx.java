package forExperts.SynchCollections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SynchCollectionsEx {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> lst = Collections.synchronizedList(new LinkedList<>());
        Runnable func = () -> Collections.addAll(lst, 1, 2, 3);

        Thread thread1 = new Thread(func);
        Thread thread2 = new Thread(func);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
