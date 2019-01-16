/* Write a Java program to find if the given number is prime or not.

Example1:

     C:\>java Sample 

     O/P Expected : Please enter an integer number 

Example2:

     C:\>java Sample 1

     O/P Expected : 1 is neither prime nor composite

Example3:

     C:\>java Sample 0

     O/P Expected : 0 is neither prime nor composite
 
 Example4:

     C:\>java Sample 10

     O/P Expected : 10 is not a prime number

Example5:

     C:\>java Sample 7

     O/P Expected : 7 is a prime number
*/

import java.util.*;
public class Pro17{
public static void main(String[] args)
{

if(args.length==0){
System.out.println("please enter the number");
System.exit(0);
}
 int i=Integer.parseInt(args[0]);
if(i==0)
System.out.println("0 s neither prime nor composite");
else if(i==1)
System.out.println("1 is neither prime nor composite");
else
{
  int yn=prime(i);
if(yn>0)

System.out.println("prime");

else
System.out.println(" not prime");
}

}

public  static int  prime(int num)
{
int flag=0;
for(int i=2;i<=num/2;i++)
{
  if(num%i==0)
{
   flag++;
break;
}
}
if(flag!=0)
return 0;
else
return 1;
}
}