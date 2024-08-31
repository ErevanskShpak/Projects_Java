package Collections;

//Задача:
//
//Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {

    }

    public static <T> Collection<T> func(Collection<T> c){
        return new HashSet<>(c);
    }
}
