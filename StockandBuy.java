
package code;
import java.util.Scanner;
import java.util.*;
public class StockandBuy {
    
  
          public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter n value=");
        int n=sc.nextInt();
        System.out.print("Enter arr value=");
        int arr[]=new int[n];
      for(int i=0;i<n;i++)
           arr[i]=sc.nextInt(); 
          int ans=0;
            if(n==0)
               System.out.print(ans);
            int bought=arr[0];                                
            for(int i=1;i<arr.length;i++)
            {
                if(arr[i]>bought)
                {
                    if(ans<(arr[i]-bought))
                        ans=arr[i]-bought;
                }
                else
                    bought=arr[i]; 
            }
     System.out.print(ans);
        
    }
}
