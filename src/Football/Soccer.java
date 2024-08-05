package Football;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Soccer {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");

        int sum = scanner.nextInt();
        int index = 0;
        while (sum > index){
            index++;
            sum -= index;
        }

        printWriter.println(index);
        printWriter.close();
    }
}