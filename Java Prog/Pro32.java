/*Write a program to print the sum of the elements of the array with the given below condition. If the array has 6 and 7 in succeeding orders, ignore 6 and 7 and the numbers between them for the calculation of sum.
Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22   
[i.e 10+3+9]
Eg2) Array Elements - 7,1,2,3,6
O/P:19
Eg3) Array Elements - 1,6,4,7,9
O/P:10
*/





import java.util.*;
public class Pro32{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  int gcount=0;
  int ccount=0;
  int value=0;
  int vmax=0;

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
 if(arr[i]==arr[i+1])
{
 ccount++;
value=arr[i];
}
 if(gcount<ccount)
{
 vmax=value;
}
}
 System.out.print(vmax);
}
}