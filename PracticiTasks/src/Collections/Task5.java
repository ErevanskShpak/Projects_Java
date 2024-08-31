package Collections;

//Итератор по двумерному массиву

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Task5 {
    public static void main(String[] args) {
        Integer[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Array2Iterator<Integer> it = new Array2Iterator<>(arr);

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

class Array2Iterator<T> implements Iterator<T> {
    private T[][] arr;
    private int i;
    private int j;

    Array2Iterator(T[][] arr) {
        this.arr = arr;
        i = 0;
        j = 0;
    }

    @Override
    public boolean hasNext() {
        if (i +1 < arr.length) {
            return true;
        } else return j < arr[i].length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (j < arr[i].length) {
            return arr[i][j++];
        } else {
            j = 0;
            return arr[++i][j++];
        }
    }
}
