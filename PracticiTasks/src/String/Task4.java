package String;

//Имеются две строки. Напишите метод, возвращающий количество вхождений одной строки в другую

public class Task4 {
    public static void main(String[] args) {
        System.out.println(func("abcabcdefg", "ab"));
    }

    public static int func(String main, String side) {
        int count = 0;
        int length = side.length();
        for (int i = 0; i < main.length()-length; i++) {
            if (main.substring(i, i+length).equals(side)) {
                count++;
                i+=length-1;
            }
        }

        return count;
    }
}
