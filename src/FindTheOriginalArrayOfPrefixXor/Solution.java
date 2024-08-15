package FindTheOriginalArrayOfPrefixXor;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findArray(new int[]{5,2,0,3,1})));
    }
    public static int[] findArray(int[] pref) {
        int[] result = new int[pref.length];
        result[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            result[i] = pref[i-1]^pref[i];
            }
        return result;
    }
}