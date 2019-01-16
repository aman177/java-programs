/*Write a program to check if a given number is prime or not*/

import java.util.*;
public class Pro15{
public static void main(String[] args)
{
int x=7;
int flag =0;
for(int i=2;i<=7;i++)
{
  if(x%i==0)
 flag++;
}
if(flag==1)
System.out.println("prime");
else
System.out.println("not prime");
}
}