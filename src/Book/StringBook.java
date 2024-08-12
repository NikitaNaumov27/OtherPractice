package Book;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringBook {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");

        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int page, str;

        if (N<K) {
            page = 1;
            str = N;
        } else {
            if (N % K == 0) {
                page = N/K;
                str = K;
            } else {
                page = N/K + 1;
                str = N-((page-1)*K);
            }
        }
        System.out.println(149%50);
        printWriter.println(page);
        printWriter.println(str);

        printWriter.close();
    }
}