/* Write a program to print the element of an array that has occurred the highest number of times
Eg) Array -> 10,20,10,30,40,100,99
O/P:10
*/



import java.util.*;
public class Pro31{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  int i;
 int p=0;
 int m=0;
 int sum=0;
int sum1=0;
int sum2=0;
  int arr[]=new int[n];
 
  for( i=0;i<n;i++)
   {
     arr[i]=sc.nextInt();
    }
 for( i=0;i<n;i++)
   {
     if(arr[i]==6)
     
     m=i;
     
     
}

for( i=0;i<n;i++)
   {
     if(arr[i]==7) 

     p=i;
     
}
if(p>m){
for(i=m;i<=p;i++)
{
 
sum1=sum1+arr[i];
}
for( i=0;i<n;i++)
   {
     sum2=sum2+arr[i];
}
sum=sum2-sum1;
System.out.println(sum);}
else {
for( i=0;i<n;i++)
   {
     sum2=sum2+arr[i];
}
System.out.println(sum2);
}
}
}

