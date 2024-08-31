package forNoobs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOFileEx1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new File("iofileex1.txt"));
        out.println("I");
        out.println(" love apples");
        out.close();

        Scanner in = new Scanner(new File("iofileex1.txt"));
        while(in.hasNext()) {
            System.out.println(in.nextLine());
        }
        in.close();
    }
}
