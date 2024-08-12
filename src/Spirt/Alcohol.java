package Spirt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Alcohol {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");

        int C = scanner.nextInt()/2;
        int H = scanner.nextInt()/6;
        int O = scanner.nextInt();
        int n = 0;

        if ((C>=0 && H>0 && O>0) && ((C>H) && (H>O))) n = O;
        else if ((C>=0 && H>0 && O>0) && ((C>H) && (H<O))) n = H;
        else if (C>=0 && H>0 && O>0) n = C;

        printWriter.println(n);
        printWriter.close();
    }
}