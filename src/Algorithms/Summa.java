package Algorithms;

import java.util.Arrays;

public class Summa {
    public static void main(String[] args) {
        System.out.println(max(new int[]{1,2,3,4}));
    }

    public static int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }

    public static int count(int[] arr){
        if (arr.length == 0) {
            return 0;
        } else {
            return 1 + count(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }

    public static int max(int[] arr){

        if (arr.length == 2) {
            return arr[0] > arr[1] ? arr[0] : arr[1];
        }

        int subMax = max(Arrays.copyOfRange(arr, 1, arr.length));
        return arr[0] > subMax ? arr[0] : subMax;


    }
}
