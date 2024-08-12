package Opt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WholeSale {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");

        int opt = 12;
        double sockPrice = 10.5;
        double packPrice = 102.5;
        int boxPrice = 1140;

        long sockCount = scanner.nextInt();
        int boxes = (int) (sockCount / (opt * opt));
        int mod = (int) (sockCount % (opt * opt));
        int packs = mod / opt;
        long items = mod % opt;

        if (items * sockPrice >= packPrice) {
            packs++;
            items = 0;
        }
        if (packs * packPrice + items * sockPrice >= boxPrice) {
            boxes++;
            packs = 0;
            items = 0;
        }

        printWriter.println(boxes + " " + packs + " " + items);
        printWriter.close();
    }
}
