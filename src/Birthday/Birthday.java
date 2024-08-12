package Birthday;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner scanner = new Scanner(new File("input.txt"));
        PrintWriter printWriter = new PrintWriter("output.txt");

        String date1 = scanner.nextLine();
        String date2 = scanner.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yy");

        Date datePetya = format.parse(date1);
        Date dateVasya = format.parse(date2);

        long difference = dateVasya.getTime() - datePetya.getTime();

        int days = (int) (difference / (24 * 60 * 60 * 1000));

        printWriter.println(days);
        printWriter.close();
    }
}