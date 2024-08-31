package basics;

import java.util.Arrays;

/*Реализуйте алгоритм сортировки пузырьком для сортировки массива*/
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 2, 8, 9, 1};
        method(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void method(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}


