package forExperts.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(11);
        lst.add(12);
        Iterator<Integer> it = lst.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
