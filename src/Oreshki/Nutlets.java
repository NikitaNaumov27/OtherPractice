package Oreshki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Nutlets {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        String str = "";
        if (N*M>=K) str = "Yes";
        else str = "No";

        printWriter.println(str);
        printWriter.close();
    }
}