package Pizza;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");

        int N = scanner.nextInt(); // кол-во разрезов
        int d = 1; // текущее кол-во кусков

        for (int i = 1; i < N; i++){
            d += i;
        }

        printWriter.println(N + d);
        printWriter.close();
    }
}