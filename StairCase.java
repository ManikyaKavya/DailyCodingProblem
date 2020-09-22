/*There exists a staircase with N steps, 
and you can climb up either 1 or 2 steps at a time. 
Given N, write a function that returns 
the number of unique ways you can climb the staircase.
 The order of the steps matters.*/

import java.util.*;

public class StairCase {
    private static int numberOfWays(int n) {
        int[] arr = new int[n + 1];
        return climbStairs(arr, 0, n);

    }

    private static int climbStairs(int[] arr, int i, int n) {
        if (i > n)
            return 0;
        if (i == n)
            return 1;

        if (arr[i] > 0) {
            return arr[i];
        }

        arr[i] = climbStairs(arr, i + 1, n) + climbStairs(arr, i + 2, n);

        return arr[i];
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(numberOfWays(num));

    }
}
