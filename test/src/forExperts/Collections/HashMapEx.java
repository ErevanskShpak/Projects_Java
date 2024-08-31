package forExperts.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(11, "Andrey");
        mp.putIfAbsent(12, "Mikola");
        mp.remove(11);
        System.out.println(mp.get(12));
        boolean isCont = mp.containsValue("Katya");
        boolean isCont2 = mp.containsKey(10);
        System.out.println(mp.keySet());
        System.out.println(mp.values());

        for (Map.Entry<Integer, String> cur: mp.entrySet()) {
            System.out.println(cur.getKey() + ": " + cur.getValue());
        }
    }
}
