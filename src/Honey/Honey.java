package Honey;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Honey {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");

        int N = scanner.nextInt();
        int V = scanner.nextInt();
        int K = scanner.nextInt();

        int sum = N * V;
        for (int i = 1; i < N; i++){
            if (K*i >= V) sum-=V;
            else sum -= K*i;
        }
        printWriter.print(K * N -1 > V ? "No " : "Yes ");
        printWriter.print(sum);
        printWriter.close();
    }
}
