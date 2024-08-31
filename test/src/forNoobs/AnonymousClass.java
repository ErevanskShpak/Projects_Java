package forNoobs;

public class AnonymousClass {
    public static void main(String[] args) {
        ITest cur = new ITest() {
            @Override
            public void doSth() {
                System.out.println("hello");
            }
        };

        cur.doSth();
    }
}

interface ITest {
    public void doSth();
}