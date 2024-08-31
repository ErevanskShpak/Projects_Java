import java.util.*;

public class Main {
    static Scanner in;
    static Random rand;
    static List<Integer> list1;
    static List<Integer> list2;

    enum Results {
        WIN, LOSS, DRAW
    }

    public static void main(String[] args) {
        rand = new Random();
        in = new Scanner(System.in);
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        int sum1 = 0, sum2 = 0;

        switch(res()) {
            case WIN:
                System.out.println("Вы победили");
                break;
            case LOSS:
                System.out.println("Вы проиграли");
                break;
            case DRAW:
                System.out.println("Ничья");
                break;
        }
    }

    private static Results res(){
        list1.add(rand.nextInt(11)+1);
        list1.add(rand.nextInt(11)+1);
        list2.add(rand.nextInt(11)+1);
        list2.add(rand.nextInt(11)+1);

        System.out.println("Карты дилера: ? " + list1.get(1));
        System.out.println("Ваши карты: " + list2.get(0) + " " + list2.get(1));
        int sum2 = list2.get(0) + list2.get(1);

        int choice, i = 2;
        while (true) {
            System.out.println("Тянете еще карту?");
            System.out.println("1 - Да");
            System.out.println("0 - Нет");
            System.out.print("Ввод: ");
            choice = in.nextInt();
            if (choice == 1) {
                list2.add(rand.nextInt(9)+1);
                sum2 += list2.get(i);
                System.out.println("Вы вытянули " + list2.get(i++));
                System.out.print("Ваши карты: ");
                for (Integer el: list2) {
                    System.out.print(el + " ");
                }
                System.out.println();

                if (sum2 > 21) return Results.LOSS;
                else if(sum2 == 21) return Results.WIN;

            } else {
                break;
            }
        }

        System.out.print("Карты дилера: ");
        for (Integer el: list1) {
            System.out.print(el + " ");
        }
        System.out.println();

        int sum1 = list1.get(0) + list1.get(1);
        i = 2;
        while(true) {
            list1.add(rand.nextInt(9)+1);
            sum1 += list1.get(i);
            System.out.println("Дилер вытянул " + list1.get(i++));
            System.out.print("Карты дилера: ");
            for (Integer el: list1) {
                System.out.print(el + " ");
            }
            System.out.println();
            if (sum1 > 21) return Results.WIN;
            else if (sum1 > sum2) return Results.LOSS;
            else if (sum1 == sum2 ) return Results.DRAW;
        }
    }
}