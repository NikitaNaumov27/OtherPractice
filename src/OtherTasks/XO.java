package OtherTasks;

public class XO {
    public static void main(String[] args) {
        System.out.println(getXO("ooxXm"));
    }

    public static boolean getXO (String str) {
        String[] line = str.split("");
        int counx = 0, couno = 0;
        for (String x: line){
            if (x.equals("x") || x.equals("X")) counx++;
            else if (x.equals("o") || x.equals("O")) couno++;
        }
        return counx == couno;
    }
}