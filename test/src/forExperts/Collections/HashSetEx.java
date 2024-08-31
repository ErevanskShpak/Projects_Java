package forExperts.Collections;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(11);
        set.remove(11);
        int size = set.size();
        boolean isEmp = set.isEmpty();
        boolean isCont = set.contains(11);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(4);
        set.addAll(set2);
        set.retainAll(set2);
        set.removeAll(set2);
    }
}
