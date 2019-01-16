/* Write a program to initialize an integer array and find the maximum and minimum value of an array*/


import java.util.*;
public class Pro25{
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
int small= arr[0];
    for(int i=0;i<n;i++)
   {  
      if(arr[i]<small)
         small=arr[i];
}
System.out.println("smallest"+small);
int max= arr[0];
    for(int i=0;i<n;i++)
   {  
      if(arr[i]>max)
         max=arr[i];
}
System.out.println("maximum"+max);
}
}