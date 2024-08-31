package forNoobs;

import java.util.Arrays;

public class EnumEx {
    public static void main(String[] args) {
        WeekDay day = WeekDay.MONDAY;

        System.out.println(day.getMood());

        day.action(2,4);

        WeekDay[] arr = WeekDay.values();
        System.out.println(Arrays.toString(arr));

        WeekDay cur = WeekDay.valueOf("MONDAY");
    }
}

enum WeekDay {
    MONDAY("-vibe") {
        @Override
        public void action(int a, int b) {
            System.out.println(a-b);
        }
    },
    TUESDAY("-vibe") {
        @Override
        public void action(int a, int b) {
            System.out.println(a+b);
        }
    },
    WEDNESDAY("norm") {
        @Override
        public void action(int a, int b) {
            System.out.println(a*b);
        }
    },
    THURSDAY("horosho") {
        @Override
        public void action(int a, int b) {
            System.out.println(a/b);
        }
    },
    FRIDAY("+vibe") {
        @Override
        public void action(int a, int b) {
            System.out.println(a+b);
        }
    },
    SATURDAY("klass") {
        @Override
        public void action(int a, int b) {
            System.out.println(a+b);
        }
    },
    SUNDAY("super") {
        @Override
        public void action(int a, int b) {
            System.out.println(a+b);
        }
    };

    private String mood;
    WeekDay(String mood) {this.mood = mood;}
    String getMood() {return mood;}
    public abstract void action(int a, int b);
}