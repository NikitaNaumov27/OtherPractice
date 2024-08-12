public class Collatz {
    public static void main(String[] args) {
        System.out.println(conjecture(26));
    }

    public static long conjecture(long x) {
        int count = 1;
        while (x!=1){
            if (x%2==0) {
                x = x/2;
                count++;
            }
            else {
                x = (x * 3) + 1;
                count++;
            }
        }
        return count;
    }
}