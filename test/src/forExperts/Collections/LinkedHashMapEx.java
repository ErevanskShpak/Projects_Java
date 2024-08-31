package forExperts.Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Double> mp = new LinkedHashMap<>(16, 0.75f, false);
        mp.put(11, 2.0);
        mp.put(15, 4.3);
        mp.put(6, 7.2);

        System.out.println(mp);

        LinkedHashMap<Integer, Double> mp2 = new LinkedHashMap<>(16, 0.75f, true);
        mp2.put(11, 2.0);
        mp2.put(15, 4.3);
        mp2.put(6, 7.2);

        System.out.println(mp2);
        mp2.get(11);
        System.out.println(mp2);
    }
}
