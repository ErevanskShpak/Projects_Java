package OOP;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(12);
        list.add(13);
        System.out.println(list.get());
        list.remove();
        System.out.println(list.get());
    }
}

class MyList<T> {
    private MyEntry<T> head;

    public void add(T data) {
        MyEntry<T> newEntry = new MyEntry<>(data);
        if (head == null) {
            head = newEntry;
        } else {
            newEntry.next = head;
            head = newEntry;
        }
    }
    public void remove() {
        if (head != null) {
            head = head.next;
        }
    }

    public T get() {
        if (head == null) {
            return null;
        } else {
            return head.object;
        }
    }

    private static class MyEntry<T> {
        T object;
        MyEntry<T> next;

        public MyEntry(T object) {
            this.object = object;
            next = null;
        }

        @Override
        public String toString() {
            return object.toString();
        }
    }
}