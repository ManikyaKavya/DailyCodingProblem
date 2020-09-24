/*Given an array of integers and a number k, 
where 1 <= k <= length of the array, 
compute the maximum values of each subarray of length k.*/

import java.util.Scanner;

public class MaxValInSubArray {
    static void MaxOfSubArray(int arr[], int n, int k) 
    { 
        int j, max; 
  
        for (int i = 0; i <= n - k; i++) { 
  
            max = arr[i]; 
  
            for (j = 1; j < k; j++) { 
                if (arr[i + j] > max) 
                    max = arr[i + j]; 
            } 
            System.out.print(max + " "); 
        } 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array:");
		int len=sc.nextInt();
        int arr[]=new int[len];
        System.out.println("Enter"+len+" array elements :");
		for(int i=0;i<len;i++)
		{
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k value:");
        int k=sc.nextInt();
        sc.close();
        MaxOfSubArray(arr, arr.length, k); 
    } 
}
