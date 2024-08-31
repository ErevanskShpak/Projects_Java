package forExperts.SynchCollections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Danik", 900);
        map.put("Nikita", 500);

        Runnable func = () -> {
            Iterator<String> it = map.keySet().iterator();
            while(it.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(it.next());
            }
        };

        new Thread(func).start();
        new Thread(func).start();
    }
}
