/*Initialize two character variables in a program and display the characters in alphabetical order.
Eg1) if first character is s and second is e
O/P: e,s
Eg2) if first character is a and second is e
O/P:a,e
*/

import java.util.*;
public class Pro7{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
char a=sc.next().charAt(0);
char b=sc.next().charAt(0);
if(a>b)
System.out.println(b+";"+a);
else
System.out.println(a+";"+b);
}
}