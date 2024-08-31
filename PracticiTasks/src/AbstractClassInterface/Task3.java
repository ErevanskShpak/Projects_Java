package AbstractClassInterface;

//Задача, немного похожая на предыдущую:
//Напишите метод fill, который принимает массив объектов, и реализацию интерфейса Function (или своего).
//Метод fill должен заполнить массив, получая новое значение по индексу с помощью реализации интерфейса Function.

import java.util.Arrays;
import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        Integer[] squares = new Integer[100];
        fill(squares, integer -> integer * integer);
        System.out.println(Arrays.toString(squares));
    }

    public static <T> void fill(T[] obj, Function<Integer, T> func) {
        for (int i = 0; i < obj.length; i++) {
            obj[i] = func.apply(i);
        }
    }
}
