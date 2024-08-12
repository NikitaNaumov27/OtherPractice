package Alphabit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) throws FileNotFoundException {

        Map<Integer, Character> map = new LinkedHashMap<>();
        int index = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            map.put(index, i);
            index++;
        }

        boolean flag = true;

        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");
        String line = scanner.nextLine();
        char[] letters = line.toCharArray();
        int[] numbers = new int[26];

        int r = letters.length - 1;
        int n = letters.length - 1, k = 0;


        while (true) {
            if (map.get(r) == letters[k]) {
                numbers[n] = k;
                n--;
            }

            k++;

            if (k == letters.length){
                r--;
                k = 0;
            }

            if (r < 0) {
                break;
            }
        }

        for (int i = 0; i < letters.length; i++){
            if (letters[numbers[i]] >= map.get(i) && letters[25] == 'Z') flag = true;
            else {
                flag = false;
                break;
            }
        }
        printWriter.println(flag ? "Yes\n" + Arrays.toString(numbers) : "No");
        printWriter.close();
    }
}