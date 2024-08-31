package forExperts.Collections;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer, Double> mp = new TreeMap<>();
        mp.put(11, 2.0);
        mp.put(9, 4.0);
        mp.put(14, 9.8);
        System.out.println(mp.get(11));
        mp.remove(9);
        System.out.println(mp);
        System.out.println(mp.descendingMap());
        System.out.println(mp.tailMap(5));
        System.out.println(mp.headMap(12));
        System.out.println(mp.lastEntry());
        System.out.println(mp.firstEntry());
    }
}
