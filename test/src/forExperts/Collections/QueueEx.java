package forExperts.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(11);
        que.offer(10);
        que.remove();
        que.poll();
        System.out.println(que.element());
        System.out.println(que.peek());
    }
}
