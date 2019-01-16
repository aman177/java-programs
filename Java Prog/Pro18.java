/*Write a program to add all the values in a given number and print. Ex: 1234->10 */

public class Pro18{
public static void main(String[] args)
{
 int n=1234;
 int x=n;
 int sum=0;
while(n!=0)
{
  sum=sum+n%10;
  n=n/10;
}
System.out.println(x+"->"+sum);
}
}
