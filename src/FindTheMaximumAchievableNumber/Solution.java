package FindTheMaximumAchievableNumber;

class Solution {
    public static void main(String[] args) {
        System.out.println(theMaximumAchievableX(4,1));
    }

    public static int theMaximumAchievableX(int num, int t) {
        for (int i = 1; i <= t; i++) {
            num++;
        }
        return num + t;
    }
}
