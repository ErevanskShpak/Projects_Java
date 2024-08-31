package forExperts.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> lst1 = new ArrayList<>();
        lst1.add("Hello");
        lst1.add("World");
        lst1.add(1, "Cucumber");
        System.out.println(lst1);
        lst1.set(1, "Apple");
        System.out.println(lst1);
        System.out.println(lst1.get(0));
        boolean isDel = lst1.remove("World");
        lst1.remove(2);

        List<String> lst2 = new ArrayList<>(5);
        lst2.add("Bebra");
        System.out.println(lst2);

        lst1.addAll(lst2);
        lst1.addAll(1, lst2);
        lst2.clear();
        int i = lst1.indexOf("Bebra");
        int j = lst1.lastIndexOf("Bebra");
        int k = lst1.size();
        boolean isEmp = lst1.isEmpty();
        boolean isCont = lst1.contains("Hello");
        System.out.println(lst1.toString());
        boolean isDelAll = lst1.removeAll(lst2);
        boolean isKeptAll = lst1.retainAll(lst2);
        boolean isContAll = lst1.containsAll(lst2);
        List<String> lst3 = lst1.subList(1, 3);
        String[] cur = lst1.toArray(new String[0]);
        List<String> lst4 = List.of("Bebra", "Hello");
        List<String> lst5 = List.copyOf(lst3);
    }
}
