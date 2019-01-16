/* Write a program to print even numbers between 23 and 57, each number should be printed in a separate row.*/
import java.util.*;
public class Pro14{
public static void main(String[] args)
{
 int x=23;
int y=57;
for(int i=x;i<=y;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}