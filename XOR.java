
package code;
import java.util.*;
public class XOR {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value:");
        int n=sc.nextInt();
        System.out.print("Enter array value:");
        int arr[]=new int[n];
      for(int i=0;i<n;i++)
           arr[i]=sc.nextInt(); 
     if (n <= 0)
	{
	System.out.print("0");
	}
	int sum = 0;
	for(int i =0;i< n;i++)
	{
	sum=sum|arr[i];
	}
	System.out.print("XOR Sum : "  + (sum * (1 << n - 1)));     
    }
    
}
