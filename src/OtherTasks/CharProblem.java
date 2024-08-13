package OtherTasks;

public class CharProblem {
    public static void main(String[] args) {
        System.out.println(howOld("5 yer"));
    }


    public static int howOld(final String herOld) {
        return Integer.parseInt(String.valueOf(herOld.charAt(0)));
    }
}