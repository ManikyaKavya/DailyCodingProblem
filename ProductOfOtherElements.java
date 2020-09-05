import java.util.*;
public class ProductOfOtherElements {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array:");
		int len=sc.nextInt();
        int arr[]=new int[len];
        int ProductArray[]=new int[len];
        System.out.println("Enter"+len+" array elements :");
		for(int i=0;i<len;i++)
		{
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(int i=0;i<len;i++)
        {
            int prod=1;
            for(int j=0;j<len;j++)
            {
                if(i!=j)
                {
                    prod=prod*arr[j];
                    ProductArray[i]=prod;
                }
            }
        }
        System.out.println("Array after modification");
        for(int i=0;i<len;i++)
		{
            System.out.println(ProductArray[i]);
        }
    }
}
