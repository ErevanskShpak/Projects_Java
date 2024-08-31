package OOP;

//Задача:
//
//        Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
//Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом, с учётом его веса.
//        Пример:
//Дан массив [1, 2, 3], и массив весов [1, 2, 10].
//        В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем значение «3».

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arrVal = {1, 2, 3, 4};
        int[] arrWeight = {1, 2, 4, 4};

        Connection con = new Connection(arrVal, arrWeight);
        System.out.println(con.getVal());
    }
}

class Connection {
    private int[] arrVal;
    private int[] arrWeight;
    private int[] arrRange;
    private int sum;

    public Connection(int[] arrVal, int[] arrWeight) {
        this.arrVal = arrVal;
        this.arrWeight = arrWeight;

        sum = 0;
        for (int weight : arrWeight) {
            sum += weight;
        }

        arrRange = new int[arrVal.length];
        int bound=0;
        for (int i = 0; i < arrRange.length; i++) {
            arrRange[i] = bound;
            bound += arrWeight[i];
        }
    }

    public int getVal() {
        Random rand = new Random();
        int weight = rand.nextInt(sum);

        int index = Arrays.binarySearch(arrRange, weight);

//        for (int i = 1; i < arrRange.length; i++) {
//            if (weight < arrRange[i]) {
//                return arrVal[i-1];
//            }
//        }
//        return arrVal[arrVal.length - 1];

        return arrVal[index>=0?index:-index-2];
    }
}