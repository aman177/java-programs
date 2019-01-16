/* Write a program to print first 5 values which are divisible by 2, 3, and 5.*/



import java.util.*;
public class Pro22{
public static void main(String[] args)
{
int a=2;
int b=3;
int c=5;
int f=0;
for(int i=1;i<1000;i++)
{
 if(f==5)
break;
if(i%a==0 && i%b==0 && i%c==0){
System.out.println(i);
f++;
}
}
}
}