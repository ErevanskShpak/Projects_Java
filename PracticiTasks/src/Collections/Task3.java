package Collections;

//Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. Напишите еще один метод,
// который выбирает из заполненного списка элемент наугад 100000 раз. Замерьте время, которое потрачено на это.
// Сравните результаты и предположите, почему они именно такие.

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fill(list);
        find(list);

        List<Integer> list2 = new LinkedList<>();
        fill(list2);
        find(list2);
    }

    public static void fill(List<Integer> c) {
        Random rand = new Random();
        for (int i = 0; i < 1000000; i++) {
            c.add(rand.nextInt(10, 20));
        }
    }

    public static void find(List<Integer> c) {
        long time = System.currentTimeMillis();

        Random rand = new Random();

        c.get(rand.nextInt(c.size()));

        System.out.println(System.currentTimeMillis() - time);
    }
}
