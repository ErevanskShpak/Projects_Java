package forExperts;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int a = sin.nextInt();
        String str = sin.next();

        Scanner sin2 = new Scanner("Hello my name is Gus\nBebra");
        char str2 = sin2.next().charAt(2);

        while (sin2.hasNextLine()) {
            System.out.println(sin2.nextLine());
        }
    }
}
