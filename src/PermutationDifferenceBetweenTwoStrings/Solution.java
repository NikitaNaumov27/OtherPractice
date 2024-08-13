package PermutationDifferenceBetweenTwoStrings;

class Solution {
    public static void main(String[] args) {
        System.out.println(findPermutationDifference("abc","bac"));
    }
    public static int findPermutationDifference(String s, String t) {
        StringBuilder stringBuilder1 = new StringBuilder(s);
        StringBuilder stringBuilder2 = new StringBuilder(t);
        int sum = 0;
        for (int i = 0; i < stringBuilder1.length(); i++) {
            for (int j = 0; j < stringBuilder2.length(); j++) {
                if (stringBuilder1.charAt(i) == stringBuilder2.charAt(j)) {
                    sum += Math.abs(i - j);
                }
            }
        }
        return sum;
    }
}