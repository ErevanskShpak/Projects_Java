package forExperts;

public class LambdaEx {
    public static void test(I i, String word) {
        System.out.println(i.func(word));
    }
    public static void test2(I2 i, String word, String word2) {
        System.out.println(i.func(word, word2));
    }

    public static void main(String[] args) {
        final int i = 10;
        test((String s) -> {return s.length() + i; }, "privet");

        test(s -> {return s.length(); }, "privet");

        test((String s) -> s.length(), "privet");

        test(s -> s.length(), "privet");

        test2((s1, s2) ->  s1 + s2, "hello", "world");
    }
}

interface I {
    int func(String word);
}

interface I2 {
    String func(String word, String word2);
}