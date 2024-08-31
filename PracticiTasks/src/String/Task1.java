package String;

//Напишите метод для поиска самой длинной строки в массиве.

public class Task1 {
    public static void main(String[] args) {
        String[] arr = {"bebra", "hui", "pizda", "ivanteevka"};
        System.out.println(func(arr));
    }

    public static String func(String[] arr) {
        String max=arr[0];
        for (String s : arr) {
            if (s.length() > max.length()) {
                max = s;
            }
        }

        return max;
    }
}
