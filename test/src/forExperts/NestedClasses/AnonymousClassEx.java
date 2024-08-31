package forExperts.NestedClasses;

public class AnonymousClassEx {
    public static void main(String[] args) {
        System.out.println(new I(){
            @Override
            public int abc(int a, int b) {
                return a-b;
            }
        }.abc(2, 3));
    }
}

interface I {
    int abc(int a, int b);
}