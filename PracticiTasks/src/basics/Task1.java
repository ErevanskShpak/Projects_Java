package basics;

/*Задача:

Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.

Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].*/

public class Task1 {
    public static void main(String[] args) {
        method(10);
    }

    public static void method(int n) {
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random()*100 - 50;
        }

        double max=arr[0], min=arr[0], avg=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            avg += arr[i];
        }

        avg /= arr.length;

        System.out.println("Макс число: " + max);
        System.out.println("Мин число: " + min);
        System.out.println("Среднее: " + avg);
    }
}
