package forExperts.NestedClasses;

public class InnerClassEx {
    public static void main(String[] args) {
        Car2 car = new Car2("BMW", 160);
    }
}

class Car2 {
    String name;
    Engine engine;

    Car2(String name, int power) {
        this.name = name;
        this.engine = new Engine(power);
    }
    Car2(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    private class Engine {
        int power;

        Engine(int power) {
            this.power = power;
        }
    }
}