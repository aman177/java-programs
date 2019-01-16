/*Write a program to check if the program has received command line arguments or not. If the program has not received the values then print "No Values", else print all the values in a single line separated by ,(comma).
Eg1) java Example
O/P: No values
Eg2) java Example Mumbai Bangalore
O/P: Mumbai,Bangalore
[Note: You can use length property of an array to check its length
*/



import java.util.*;
public class Pro6{
public static void main(String[] args)
{
   if(args.length==0)
{
 System.out.println("no values");
}
else
{
int a=args.length;
int j=a-1;
for(int i=0;i<a;i++)
{
 System.out.print(args[i]);
if(j>0)
{
System.out.print(",");
j--;
}
}
}
}
}
