
package code;
import java.util.Scanner;
public class leaders {
     
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value:");
        int n=sc.nextInt();
          System.out.print("Enter array value:");
        int arr[]=new int[n];
      for(int i=0;i<n;i++)
           arr[i]=sc.nextInt(); 
        int curr=arr[n-1];
        System.out.print(curr+" ");
        for(int i=n-2;i>=0;i--)
        {
              if(curr<arr[i+1]){
                 curr=arr[i];
                  System.out.print(curr+" ");
             }
        }
    }
    
}
