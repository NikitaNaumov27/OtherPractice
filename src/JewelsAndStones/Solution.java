package JewelsAndStones;

class Solution {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbBb"));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] jewelChars = jewels.toCharArray();
        for (char jewelChar : jewelChars) {
            for (char stoneChar : stones.toCharArray()) {
                if (jewelChar == stoneChar) {
                    count++;
                }
            }
        }
        return count;
    }
}
