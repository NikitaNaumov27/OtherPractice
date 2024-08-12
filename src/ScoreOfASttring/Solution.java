package ScoreOfASttring;

class Solution {
    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
    }




    public static int scoreOfString(String s) {
        char[] chars = s.toCharArray();
        int score = 0;
        for (int i = 0; i < chars.length-1; i++) {
            score += Math.abs(((int)chars[i] - (int)chars[i+1]));
        }
        return score;
    }
}
