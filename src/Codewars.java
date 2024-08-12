public class Codewars {
    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[]{1,2,2}));
    }
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for (int x : array){
            sum += x;
        }
        if (sum%2==0) return "even";
        else return "odd";
    }
}