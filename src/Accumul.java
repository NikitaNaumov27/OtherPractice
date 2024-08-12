public class Accumul {
    public static void main(String[] args) {
        System.out.println(accum("Enf"));
    }

    public static String accum(String s) {
        int counter = 1, j = 0;
        String[] str = s.split("");
        StringBuilder sb = new StringBuilder();
        while (counter <= s.length()){
            if (counter > 1) sb.append("-");
            for (int i = 0; i < counter; i++){
                if (i == 0)  sb.append(str[j].toUpperCase());
                else sb.append(str[j].toLowerCase());
            }
            j++; counter++;
        }
        return sb.toString();
    }
}