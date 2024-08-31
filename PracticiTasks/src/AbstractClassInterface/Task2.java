package AbstractClassInterface;

import java.util.Arrays;

//Задача:
//
//Напишите метод filter, который принимает на вход массив (любого типа) и реализаци интерфейса Filter c методом apply(Object o),
// чтобы убрать из массива лишнее.
//Проверьте как он работает на строках или других объектах.

public class Task2 {
    public static void main(String[] args) {
        String[] array =
                new String[]{"1rewf ", "feefewf", "a", null, "1"};

        String[] newArray =  (String[]) filter(array, new Filter() {
            @Override
            public boolean apply(Object o) {
                return o != null;
            }
        });

        System.out.println(Arrays.toString(newArray));
    }

    interface Filter {
        boolean apply(Object o);
    }

    public static Object[] filter(Object[] obj, Filter filter) {
        int offset =0;

        for(int i=0; i<obj.length; i++) {
            if (!filter.apply(obj[i])) {
                offset++;
            } else {
                obj[i-offset] = obj[i];
            }
        }

        return Arrays.copyOf(obj, obj.length - offset);
    }
}