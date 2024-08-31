package Collections;

//Частотный слова слов

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String text = "Собеседовался сегодня на позицию джуна. Решил поделится этим опытом если кому интересно, вкратце я перечислю только вопросы которые мне задавали:\n" +
                "1. Первое что меня спросили и меня немного это удивило было над каким последним проектом я работал, и что я в нем разработал;\n" +
                "2. как я его тестировал и что использовал;\n" +
                "3. SOLID принципы и надо было хотяб один пример дать, где не справлялся мне объясняли;\n" +
                "4. Design Patterns но остановились только на Singleton-e честно я был готов и по другим пообщаться, пришлось написать пример + потокобезопасный пример (и немного пообщались по многопоточности);\n" +
                "5. из Java Core вопросов не было, было 3 задачи с подвохом: стримы, полиморфизм, и в последней надо было объяснить что произойдет при бесконечном добавлении элементов в лист;\n" +
                "6. очень много вопросов теоретических по спрингу и хайбернейту;\n" +
                "7. как устроена память в jvm;\n" +
                "8. надо было объяснить как создать RESTful контроллер который будет отвечать JSON-oм, и надо было написать какие url и методы будут использоваться для запросов;\n" +
                "9. вопросы по SQL но довольно простые, немного с JOIN напутал;\n" +
                "10. как подключить хайбернейт к спрингу;\n" +
                "11. немного о структуре проекта и о его слоях как они взаимодействуют, где какая логика должна быть.\n" +
                "И еще мелочные вопросы были. Кстати моё первое собеседование. Из того что я не знал мне объясняли и это было очень классно я остался очень довольным. Может помогу кому-то этим комментом.";
        func(text);
    }

    public static void func(String text) {
        Map<String, Integer> map = new HashMap<>();

        text = text.toLowerCase();

        List<String> words = new ArrayList<>(List.of(text.split(" ")));

        for (String word : words) {
            char first = word.charAt(0);
            if (first == '(' || first == '[' || first == '{') {
                word = word.substring(1);
            }

            char last = word.charAt(word.length() - 1);
            if (last == ',' || last == '.' || last == '!' || last == '?' || last == ')' || last == ']' || last == '}') {
                word = word.substring(0, word.length() - 1);
            }

            map.compute(word, (k, v) -> v == null ? 1 : v + 1);
        }

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByKey());
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
