package Letters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Letter {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");

        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int l =  0;
        String[] str = new String[N];
        scanner.nextLine();

        for (int i = 0; i < N; i++){
            str[i] = scanner.nextLine();
            if (str[i].length() > K) {
                printWriter.print("Impossible.");
                break;
            }
            l = (K-str[i].length())/2;
            for (int j = 0; j < l; j++) printWriter.print(" ");
            printWriter.print(str[i]);
            for (int j = 0; j < K-(l+str[i].length()); j++) printWriter.print(" ");
            printWriter.println();
        }
        printWriter.close();
    }
}
