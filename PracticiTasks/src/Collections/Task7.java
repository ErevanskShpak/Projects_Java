package Collections;

import java.util.*;

//Напишите метод, который получает на вход Map<K, V> и возвращает Map, где ключи и значения поменяны местами.
// Так как значения могут совпадать, то тип значения в Map будет уже не K, а
//Collection<K>:
public class Task7 {
    public static void main(String[] args) {

    }

    public static <K, V> Map<V, Collection<K>> func(Map<K, V> map) {
        Map<V, Collection<K>> result = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            result.compute(entry.getValue(), (k, v) -> {
                if (v == null) {
                    v = new HashSet<>();
                }
                v.add(entry.getKey());
                return v;
            });
        }

        return result;
    }
}
