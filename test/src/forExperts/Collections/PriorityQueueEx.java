package forExperts.Collections;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        que.add(2);
        que.add(1);
        que.add(3);
        que.add(0);
        que.add(6);
        que.add(5);
        que.add(7);
        System.out.println(que);

        que.poll();
        System.out.println(que);
        que.poll();
        System.out.println(que);
        que.poll();
        System.out.println(que);
        que.poll();
        System.out.println(que);
        que.poll();
        System.out.println(que);
        que.poll();
        System.out.println(que);
    }
}
