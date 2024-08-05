package Metro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Underground {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");

        int N = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        if (((i + 1) == j) || (i - 1) == j)
            printWriter.println(0);
        else if (i - j < 0){
            printWriter.println(Math.abs(N-j+i)-2);
        }
        else {
            printWriter.println(i-j-2);
        }
        printWriter.close();
    }
}