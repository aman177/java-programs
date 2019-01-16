/* Write a program to initialize an integer array and print the sum and average of the array */



import java.util.*;
public class Pro24{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  
  int arr[]=new int[n];
  int l= arr.length;
  for(int i=0;i<n;i++)
   {
     arr[i]=sc.nextInt();
    }
int sum=0;
  for(int i=0;i<n;i++)
   {
      sum=sum+arr[i];
   }
  System.out.println("sum="+sum);
  System.out.println("avg"+(long)sum/l);
}
}