package Ballot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Ballot {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");
        int K = scanner.nextInt();
        int[] mas = new int[K];
        for (int i = 0; i < K; i++){
            mas[i] = scanner.nextInt();
        }

        Arrays.sort(mas);
        int sred = (K / 2) + 1;
        int sum = 0;

        for (int i = 0; i < sred; i++){
            sum += mas[i]/2 + 1;
        }

        printWriter.println(sum);
        printWriter.close();
    }
}
