/* Write a program to print month in words, based on input month in numbers
Example1:

     C:\>java Sample 12

     O/P Expected : December

Example2:

     C:\>java Sample 

     O/P Expected : Please enter the month in numbers

Example3:

     C:\>java Sample 15

     O/P Expected : Invalid month
*/




import java.util.*;
public class Pro12{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
int i=sc.nextInt();
switch(i){
case 1:System.out.print("jan");
break;
case 2:System.out.print("feb");
break;
case 3:System.out.print("mar");
break;
case 4:System.out.print("april");
break;
case 5:System.out.print("may");
break;
case 6:System.out.print("june");
break;
case 7:System.out.print("july");
break;
case 8:System.out.print("aug");
break;
case 9:System.out.print("sept");
break;
case 10:System.out.print("oct");
break;
case 11:System.out.print("nov");
break;
case 12:System.out.print("dec");
break;
default:System.out.print("error");
}
}
}
