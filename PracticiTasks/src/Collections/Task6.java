package Collections;

//Напишите метод, который получает на вход массив элементов типа К (Generic) и возвращает Map<K, Integer>,
// где K — значение из массива, а Integer — количество вхождений в массив.
//То есть сигнатура метода выглядит так:

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 1, 4, 5, 6, 7, 1, 9, 2 };
        System.out.println(func(arr).toString());
    }

    public static <T> Map<T, Integer> func(T[] arr) {
        Map<T, Integer> map = new HashMap<>();
        for (T t : arr) {
            map.compute(t, (k, v) -> v == null ? 1 : v + 1);
        }

        return map;
    }
}
