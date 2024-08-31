import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> set = new LinkedHashMap<>();
        set.put("first", 8.6);
        set.put("second", 8.1);
        set.put("third", 8.5);
        set.put("fourth", 8.2);
        System.out.println(set);

        System.out.println(set.get("second"));
        System.out.println(set.get("third"));
        System.out.println(set);
//        System.out.println(set.contains("first"));
//        System.out.println(set);
    }
}