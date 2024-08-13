package ShuffleTheArray;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7},3)));  //2,3,5,4,1,7   0,3 1,4, 2,5
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] res = nums.clone();
        int j = 0, k = 0;
        for (int i = 1; i <= nums.length; i+=2) {
            res[i] = nums[n];
            res[j] = nums[k];
            j+=2;
            n++;
            k++;
        }
        return res;
    }
}
