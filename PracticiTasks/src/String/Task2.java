package String;

//Напишите метод, который проверяет является ли слово палиндромом.

public class Task2 {
    public static void main(String[] args) {
        System.out.println(func("шалава"));
    }

    public static boolean func(String word) {
        for (int i=0, j = word.length()-1; i<j; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}
