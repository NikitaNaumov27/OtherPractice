package ConcatenationOfArray;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1,2,3,4,5})));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[nums.length+i] = nums[i];
        }
        return result;
    }
}
