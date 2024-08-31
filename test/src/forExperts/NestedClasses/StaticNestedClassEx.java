package forExperts.NestedClasses;

public class StaticNestedClassEx {
    public static void main(String[] args) {
        Car car = new Car("Mercedes");
        Car.Engine engine1 = new Car.Engine(160);
    }
}

class Car {
    String name;

    Car(String name) {
        this.name=name;
    }

    public static class Engine {
        int power;

        Engine(int power) {
            this.power = power;
        }
    }
}
