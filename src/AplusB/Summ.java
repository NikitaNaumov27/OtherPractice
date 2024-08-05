package AplusB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Summ {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        PrintWriter printWriter = new PrintWriter("output.txt");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        printWriter.println(a+b);
        printWriter.close();
    }
}
