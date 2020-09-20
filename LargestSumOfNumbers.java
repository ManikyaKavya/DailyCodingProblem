/*Given a list of integers, 
write a function that returns the largest sum
 of non-adjacent numbers.
Numbers can be 0 or negative.*/

import java.util.*;

public class LargestSumOfNumbers {
    static int getLargestSum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        int first = max(0, array[0]);
        int second = max(first, array[1]);
        int sum = second;
        for (int index = 2; index < array.length; index++) {
            sum = max(second, first + array[index]);
            first = second;
            second = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter" + len + " array elements :");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int sum = getLargestSum(arr);
        System.out.println(sum);
        
    }

	static int max(int first, int second) {
		return (first>second)?first:second;
	}
    
}
