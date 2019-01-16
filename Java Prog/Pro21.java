/*Write a Java program to find if the given number is palindrome or not

Example1:

     C:\>java Sample 110011

     O/P Expected : 110011 is a palindrome

Example2:

     C:\>java Sample 1234

     O/P Expected : 1234 is not a palindrome
*/



import java.util.*;
public class Pro21{
public static void main(String[] args)
{
    Scanner sc =new Scanner(System.in);
 int n= sc.nextInt();
 int x=n;
 int r=0;
while(n!=0)
{
  r=r*10+n%10;
  n=n/10;
}
if(x==r)
System.out.println("Pallindrome");
else
System.out.println(" not Pallindrome");
}
}