package Eureka;

import java.util.ArrayList;
import java.util.List;

class SumDigPower {
    public static void main(String[] args) {
        System.out.println(sumDigPow(88,90));
    }

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();
        for (long i = a; i <= b; i++) {
            long temp = i, sum = 0;
            int n = String.valueOf(i).length();
            for (int j = n; j >= 1; j--) {
                long curr = temp%10;
                sum += (long) Math.pow(curr,j);
                temp = temp/10;
            }
            if (sum == i) result.add(i);
        }
        return result;
    }
}
