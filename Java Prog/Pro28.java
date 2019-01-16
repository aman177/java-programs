/*
Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array
*/    



import java.util.*;
public class Pro28{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  
  int arr[]=new int[n];
 int l=arr.length;
  for(int i=0;i<n;i++)
   {
     arr[i]=sc.nextInt();
    }
int temp;
int i,j;
for(i=0;i<n;i++)
{
for( j =i+1;j<n;j++)
{
  if(arr[i]>arr[j])
 {
      temp=arr[j];
      arr[j]=arr[i];
       arr[i]=temp;
}
}
}
for( i=0;i<n;i++)
{
System.out.print(arr[i]);

}
System.out.print("smallest two number are"+arr[0]+arr[1]);
System.out.print("largest two number are"+arr[n-1]+arr[n]);
}
}
