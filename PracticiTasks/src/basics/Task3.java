package basics;

/*Задача:

        Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.*/

public class Task3 {
    public static void main(String[] args) {
        method();
    }

    public static void method(){
        outloop: //label
        for(int i=2; i<=100; ++i) {
            boolean isSimple=true;
            for(int j=2; j<i; ++j) {
                if (i%j == 0) {
                    continue outloop; //labeled statement(Позволяет пропустить внешний цикл)
                }
            }
            System.out.println(i);
        }
    }
}
