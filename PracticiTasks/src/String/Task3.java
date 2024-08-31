package String;

//Напишите метод, заменяющий в тексте все вхождения слова Навальный «бяка» на «[вырезано
//цензурой]».

import java.util.Arrays;

public class Task3  {
    public static void main(String[] args) {
        String text="бяка упал с лестницы";

        System.out.println(func(text));
    }

    public static String func(String text) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("бяка")) {
                words[i] = "[вырезано цензурой]";
            }
        }

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word);
            result.append(" ");
        }

        return result.toString();
    }
}
