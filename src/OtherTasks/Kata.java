package OtherTasks;

class Kata {
    public static void main(String[] args) {
        System.out.println(getMiddle("t"));
    }
    public static String getMiddle(String word) {
        String[] str = word.split("");
        int middle = word.length()/2;
        if (word.length()%2 == 0){
            return str[middle - 1] + str[middle];
        }else return str[middle];
    }
}