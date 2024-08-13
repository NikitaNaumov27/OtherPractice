package OtherTasks;

public class NoBoring {
    public static void main(String[] args) {
        System.out.println(noBoringZeros(0));
    }
    public static int noBoringZeros(int n) {
        if (n == 0) return n;
        else {
            while (n % 10 == 0) {
                n = n / 10;
            }
        }
        return n;
    }
}