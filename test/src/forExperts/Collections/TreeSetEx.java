package forExperts.Collections;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(11);
        set.add(15);
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.headSet(16));
        System.out.println(set.tailSet(10));
        System.out.println(set.subSet(4, 8));
    }
}
