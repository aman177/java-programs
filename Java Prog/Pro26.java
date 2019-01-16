/* Write a program to initialize an integer array with values and check if a given number is present in the array or not. If the number is not found, it will print -1 else it will print the index value of the given  number in the array
Ex1) Array elements are  {1,4,34,56,7} and the search element is 90
O/P: -1
Ex2)Array elements are  {1,4,34,56,7} and the search element is 56
O/P: 4
*/


import java.util.*;
public class Pro26{
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
System.out.println("enter the number to check");
 int num=sc.nextInt();
int index=0;
for(int i=0;i<n;i++)
{
  if(num==arr[i])
  {
        index=i+1;
}
}
if (index>0)
System.out.println("indext of"+num+"is"+index);
else
System.out.println("-1");
}
}
