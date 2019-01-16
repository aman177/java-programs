/* Write a program to reverse a given number and print
Eg1)
I/P: 1234
O/P:4321
Eg2)
I/P:1004
O/P:4001
*/


import java.util.*;
public class Pro20{
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

System.out.println(r);
}
}