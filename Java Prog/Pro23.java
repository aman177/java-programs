/* Write a program that displays a menu with options 1. Add 2. Sub
Based on the options chosen, read 2 numbers and perform the relevant operation. After performing the operation, the program should ask the user if he wants to continue. If the user presses y or Y, then the program should continue displaying the menu else the program should terminate.
[ Note: Use Scanner class, you can take help from the trainer regarding the same ]

*/




import java.util.*;
public class Pro23{
public static void main(String[] args)
{
 Scanner input =new Scanner(System.in);
boolean mainLoop = true;
int choice;
int flag=0;
while(flag==0)
{
System.out.println("\t"+"Menu with options"+"\t");
System.out.println("1. Add");
System.out.println("2. Sub");
System.out.println("3. Exit");
System.out.println("Enter your menu choice");
choice=input.nextInt();
switch(choice)
{
 case 1:
        int n1,n2,sum;
          System.out.println("Enter the first number");
          n1 =input.nextInt();
          System.out.println("Enter the second number");
          n2 =input.nextInt();
         sum =n1+n2;
         System.out.println("SUM OF NUMBER IS"+""+sum);
         break;

 case 2:
           int s1,s2,sub;
          System.out.println("Enter the first number");
          s1 =input.nextInt();
          System.out.println("Enter the second number");
          s2 =input.nextInt();
           if(s1>s2)
          sub =s1-s2;
           else
           sub= s2-s1;
         System.out.println("SUBTRACTION OF NUMBER IS"+" "+sub);
         break;
 case 3:
         System.exit(0);
         break;
   default:
          System.out.println("invalid input");
          break;
}
System.out.println("Do you want to continue?");
 char ch=input.next().charAt(0);
if (ch=='y'||ch=='Y')
continue;
else{
System.out.println("thank you");
flag=1;
}
}
}
}
     

        

         