package BigOrSmall;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MoreLess {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String str = "";

        if (A>B) str = ">";
        else if (A<B) str = "<";
        else str = "=";

        printWriter.println(str);
        printWriter.close();
    }
}