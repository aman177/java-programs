/* Write a program to print prime numbers between 10 and 99.*/

import java.util.*;
public class Pro16{
public static void main(String[] args)
{
for(int i=10;i<100;i++)
{
  int yn=prime(i);
if(yn>0)
{
System.out.println(i);
}
}
}
public static int prime(int num)
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