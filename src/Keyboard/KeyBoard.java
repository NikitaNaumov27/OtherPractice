package Keyboard;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class KeyBoard {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");
        String[] keyboard = new String[]{"q","w","e","r","t","y","u","i","o","p",
                                        "a","s","d","f","g","h","j","k","l",
                                           "z","x","c","v","b","n","m"};
        String letter = scanner.nextLine();
        for (int i = 0; i < keyboard.length; i++){
            if (keyboard[keyboard.length-1].equals(letter)){
                printWriter.println(keyboard[0]);
                break;
            }
            else if (keyboard[i].equals(letter)) printWriter.println(keyboard[i + 1]);
        }
        printWriter.close();
    }
}