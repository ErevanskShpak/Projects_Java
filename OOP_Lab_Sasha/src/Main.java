import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte choice, res = 0;

        System.out.println("""
                Что такое класс в Java?
                1. Уровень сложности программы. Все операторы делятся на классы в зависимости от сложности их использования.
                2. Базовый элемент объектно-ориентированного программирования в языке Java.
                3. Просто одно из возможных названий переменной.
                4. Такое понятие есть только в C++, в Java такого понятия нет.""");
        choice = inputNumber();
        if (choice == 2)
            res++;

        System.out.println("""
                Как объявить класс в коде?
                1. class MyClass {}
                2. new class MyClass {}
                3. select * from class MyClass {}
                4. MyClass extends class {}""");
        choice = inputNumber();
        if (choice == 1)
            res++;

        System.out.println("""
                Для чего используется оператор NEW?
                1. Для создания новой переменной.
                2. Для объявления нового класса.
                3. Для создания экземпляра класса.
                4. Это антагонист оператора OLD.""");
        choice = inputNumber();
        if (choice == 3)
            res++;

        System.out.println("""
                Что означает ключевое слово extends?
                1. Что данный класс наследуется от другого.
                2. Что это дополнительный модуль класса, который расширяет его свойства.
                3. Что два класса делают одно и то же.
                4. Что это самый большой класс в программе.""");
        choice = inputNumber();
        if (choice == 1)
            res++;

        System.out.println("""
                Что означает перегрузка метода в Java (overload).
                1. Изменение поведения метода класса относительно родительского.
                2. Изменение поведения метода класса относительно дочернего.
                3. Несколько методов с одинаковым названием, но разным набором параметров.
                4. Несколько разных классов с одинаковым методом.""");
        choice = inputNumber();
        if (choice == 3)
            res++;

        System.out.println("""
                Что означает переопределение метода в Java (override).
                1. Изменение поведения метода класса относительно родительского.
                2. Изменение поведения метода класса относительно дочернего.
                3. Несколько методов с одинаковым названием, но разным набором параметров.
                4. Несколько разных классов с одинаковым методом.""");
        choice = inputNumber();
        if (choice == 1)
            res++;

        System.out.println("""
                Чем отличаются static-метод класса от обычного метода класса.
                1. Поведение обычного метода класса можно изменить в классе-наследнике, а поведение static-метода нельзя.
                2. Обычный метод класса можно переопределить, а static-метод нельзя.
                3. Обычный метод класса работает от объекта класса, а static-метод от всего класса.
                4. Static-метод класса можно вызывать только внутри класса, а обычный - в любой части кода.""");
        choice = inputNumber();
        if (choice == 3)
            res++;

        System.out.println("""
                Как вызвать static-метод внутри обычного?
                1. Никак, static-метод можно вызвать только от объекта класса.
                2. Можно, надо перед этим перегрузить обычный метод класса.
                3. Можно, надо перед этим переопределить обычный метод класса.
                4. Можно, ничего дополнительно делать не надо.""");
        choice = inputNumber();
        if (choice == 4)
            res++;

        System.out.println("""
                Для чего необходимо ключевое слово this
                1. Это указатель на переопределенный метод класса.
                2. Это указатель на текущий объект класса внутри самого класса.
                3. Это не ключевое слово.
                4. Это ключевое слово для вызова обычного метода внутри static-метода.""");
        choice = inputNumber();
        if (choice == 2)
            res++;

        System.out.println("""
                Что вернет метод, объявленный следующим образом:
                public static int getAmount()
                1. Не ясно, надо смотреть код метода.
                2. Вернет static-поле класса.
                3. Вернет ссылку на объект класса this.
                4. Вернет целочисленное значение.""");
        choice = inputNumber();
        if (choice == 4)
            res++;

        System.out.println("Вы набрали " + res + " из 10 баллов");
        try {
            System.in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static class RangeException extends Exception{

    }

    public static byte inputNumber() {
        Scanner hui = new Scanner(System.in);

        byte choice;
        while (true) {
            System.out.print("Выбор: ");
            try {
                choice = hui.nextByte();
                if (!(choice >= 1 && choice <=4)) {
                    throw new RangeException();
                }
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Некорректный ввод, ввод должен представлять цифру");
                hui.nextLine();
            }
            catch (RangeException e) {
                System.out.println("Неверный диапазон ввода, ввод должен быть от 1 до 4");
            }
        }

        return choice;
    }
}
