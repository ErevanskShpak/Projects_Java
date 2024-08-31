package Collections;

//Написать итератор по массиву

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Task4 {
    public static void main(String[] args) {

    }
}

class ArrayIterator<T> implements Iterator<T> {
    private T[] arr;
    private int index;

    ArrayIterator(T[] arr) {
        this.arr = arr;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < arr.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return arr[index++];
    }
}