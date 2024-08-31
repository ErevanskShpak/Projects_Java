package forExperts.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
    public static void main(String[] args) {
        Deque<Integer> deq = new ArrayDeque<>();
        deq.addFirst(11);
        deq.addLast(15);
        deq.offerFirst(10);
        deq.offerLast(14);
        deq.removeFirst();
        deq.removeLast();
        deq.pollFirst();
        deq.pollLast();
        System.out.println(deq.getFirst());
        System.out.println(deq.getLast());
        System.out.println(deq.peekFirst());
        System.out.println(deq.peekLast());
    }
}
