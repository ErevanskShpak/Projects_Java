import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str;
        System.out.print("Введите строку для обращения: ");
        str = in.nextLine();

        StringBuilder strNew = new StringBuilder(str);
        strNew.reverse();

        System.out.print("Строка после обращения: ");
        System.out.println(strNew);
    }
}