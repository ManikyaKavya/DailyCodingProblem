
import java.util.*;
import java.util.Scanner;

class SumOfPair
{	
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the length of array:");
			int len=sc.nextInt();
			int arr[]=new int[len];
			for(int i=0;i<len;i++)
			{
				System.out.println("Enter arr["+i+"] value");
				arr[i]=sc.nextInt();
			}
			System.out.println("enter the target sum");
			int TargetSum=sc.nextInt();
			sc.close();
			int l=0,r=len-1;
			boolean returnVal = false;
			Arrays.sort(arr);
			while(l<r)
			{
				if(arr[l]+arr[r] == TargetSum)
				{
					returnVal = true;
					break;
				}
				else if(arr[l]+arr[r]< TargetSum)
				 	l++;
				else
					r--;
			}
			System.out.println(returnVal);
		
	}
}