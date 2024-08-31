package Recursion;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[10000000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        Arrays.sort(arr);

        long time = System.currentTimeMillis(); // текущее время, unix-time
        bruteForce(arr, 40);
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        myBinarySearch(arr, 40);
        System.out.println(System.currentTimeMillis() - time);
    }

    public static int bruteForce(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    return i;
                }
        }

        return -1;
    }

    public static int myBinarySearch(int[] arr, int key) {
        return myBinarySearchRecursive(arr, key, 0, arr.length - 1);
    }

    public static int myBinarySearchRecursive(int[] arr, int key, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            return myBinarySearchRecursive(arr, key, low, mid - 1);
        } else {
            return myBinarySearchRecursive(arr, key, mid + 1, high);
        }
    }
}