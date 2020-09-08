import java.util.*;
public class MissingFirstNumber
 {
    // Function to find smallest positive 
    // missing number. 
    static int findMissingNo(int []arr, int n) 
    {
        int val; 
        int nextval; 
      
        for (int i = 0; i < n; i++) { 
            if (arr[i] <= 0 ) 
                continue; 
      
            val = arr[i];
            while (arr[val - 1] != val) { 
                nextval = arr[val - 1]; 
                arr[val - 1] = val; 
                val = nextval; 
                if (val <= 0 || val > n) 
                    break; 
            } 
        } 
        for (int i = 0; i < n; i++) { 
            if (arr[i] != i + 1) { 
                return i + 1; 
            } 
        } 
        return n + 1; 
    } 
  
    public static void main (String[] args)  
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
        sc.close();
          
        int missing = findMissingNo(arr, len); 
          
        System.out.println( missing); 
    }
      
 }
