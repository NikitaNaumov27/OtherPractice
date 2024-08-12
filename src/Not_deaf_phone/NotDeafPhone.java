package Not_deaf_phone;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NotDeafPhone {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        PrintWriter printWriter = new PrintWriter("output.txt");
        printWriter.println(scanner.nextLine());
        printWriter.close();
    }
}
