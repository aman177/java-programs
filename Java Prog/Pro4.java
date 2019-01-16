/* Write a program to check if a given number is Positive, Negative, or Zero.*/

import java.util.*;
public class Pro4{
public static void main(String[] args)
{
   Scanner sc= new Scanner(System.in);
 int i=sc.nextInt();
 if (i>0)
System.out.print("positive");
else if(i<0)
System.out.print("negative");
else
System.out.print("Zero");
}
}
