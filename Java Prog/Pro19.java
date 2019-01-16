/* Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *



Example1:

     C:\>java Sample 

     O/P Expected : Please enter an integer number

Example1:

     C:\>java Sample 3

     O/P Expected :
                   *
                   *  * 
                   *  *  *
*/


import java.util.*;
public class Pro19{
public static void main(String[] args)
{

if(args.length==0){
System.out.println("please enter the number");
System.exit(0);
}
 int n=Integer.parseInt(args[0]);
 for(int i=0;i<n;i++)
{
  for(int j=0;j<=i;j++){
 System.out.print("*");
}
System.out.println();
}
}
}
