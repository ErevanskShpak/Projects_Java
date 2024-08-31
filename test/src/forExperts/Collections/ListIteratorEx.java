package forExperts.Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        List<Character> lst = new LinkedList<>();
        String s = "Hello";
        for (char cur: s.toCharArray()) {
            lst.add(cur);
        }
        ListIterator it = lst.listIterator();
        ListIterator reverseIt = lst.listIterator(lst.size());

        while (it.hasNext() && reverseIt.hasPrevious()) {
            char cur = (char) it.next();
            if (it.next() != reverseIt.previous()) {
                break;
            }
        }
    }
}
