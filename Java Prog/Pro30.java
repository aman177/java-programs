/*Write a program to remove the duplicate elements in an array and print
Eg) Array Elements--12,34,12,45,67,89
O/P: 12,34,45,67,89 
*/




import java.util.*;
public class Pro30{
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
for(i=0;i<n-1;i++)
{
 if(arr[i]!=arr[i+1])
{
 System.out.print(arr[i]+" ");
}
}
 System.out.print(arr[i]);
}
}
