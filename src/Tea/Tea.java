package Tea;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tea {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");
        int result = 0;
        int N = scanner.nextInt();
        int[] numbers = new int[N];
        int i = 0;
        while (scanner.hasNext()){
            numbers[i] = scanner.nextInt();
            i++;
        }
        for (int j = 0; j < numbers.length; j++){
            if (numbers.length == 1) {
                result = numbers[j]-1;
                break;
            } else {
                result += numbers[j]-1;
            }
        }

        printWriter.println(++result);
        printWriter.close();
    }
}