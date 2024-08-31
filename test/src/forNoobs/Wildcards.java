package forNoobs;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<Animal> lst1 = new ArrayList<>();
        List<Dog> lst2 = new ArrayList<>();

        test(lst1);
        test(lst2);
    }

    public static void test(List<? extends Animal> arr) {
        for (Animal cur:arr) {
            System.out.println(cur);
        }
    }
}

class Animal {
    private int id;
}

class Dog extends Animal {

}