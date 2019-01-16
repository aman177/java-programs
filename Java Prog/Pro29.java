/* Write a program to initialize an array and print them in a sorted fashion */



import java.util.*;
public class Pro29{
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
}
}