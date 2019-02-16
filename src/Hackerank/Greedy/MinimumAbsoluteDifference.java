package Hackerank.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumAbsoluteDifference {

    public static void main(String[] args) {
        int n = 10;
        int array[] = new int[]{3,-7,0};
        int minAbsolute = minimumAbsolute(array);
        System.out.println(minAbsolute);
    }

    private static int minimumAbsolute(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Math.abs(arr[0] - arr[1]);
        for (int i = 2; i < arr.length; i++) {
            int x = Math.abs(arr[i]-arr[i-1]);
            if(x<minDiff){
                minDiff = x;
            }
        }
        return minDiff;
    }

}
