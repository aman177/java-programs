/*Initialize an integer array with ascii values and print the corresponding character values in a single row. */



import java.util.*;
public class Pro27{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt();
  
  int arr[]=new int[n];
  int l= arr.length;
  for(int i=0;i<n;i++)
   {
     arr[i]=sc.nextInt();
    }
for(int i=0;i<n;i++)
   {
System.out.println((char)arr[i]);
}
}
}
