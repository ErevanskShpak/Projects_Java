package AbstractClassInterface;

//Задача:
//
//Напишите класс BaseConverter для конвертации из градусов по Цельсию в
//Кельвины​, ​Фаренгейты​, и так далее. У класса должен быть метод convert, который
//и делает конвертацию.

public class Task1 {
    public static void main(String[] args) {
        double temperature = 23.5;
        System.out.println("t = " +
                Converter.fabric(1).convert(temperature));
        System.out.println("t = " +
                Converter.fabric(2).convert(temperature));
        System.out.println("t = " +
                Converter.fabric(3).convert(temperature));
    }
}

interface Converter {
    double convert(double value);

    static Converter fabric(int choice) {
        return switch (choice) {
            case 1 -> new CelsiusConverter();
            case 2 -> new FarenheitConverter();
            case 3 -> new KelvinConverter();
            default -> null;
        };
    }
}

class CelsiusConverter implements Converter {

    @Override
    public double convert(double value) {
        return value;
    }
}

class FarenheitConverter implements Converter {

    @Override
    public double convert(double value) {
        return value * 1.8 + 32;
    }
}

class KelvinConverter implements Converter {

    @Override
    public double convert(double value) {
        return value + 273;
    }
}

