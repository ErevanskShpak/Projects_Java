package basics;

/*Задача:

Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).*/

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 2, 3, 0, 4, 2};

        System.out.println(Arrays.toString(removeElement(arr, 2)));
    }

    public static int[] removeElement(int[] nums, int val) {
        int offset =0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                nums[i-offset] = nums[i];
            }
        }

        return Arrays.copyOf(nums, nums.length - offset);
    }
}
