/*Write a program to convert from upper case to lower case and vice versa of an alphabet
 and print the old character and new character as shown in example (Ex: a->A, M->m).
*/

import java.util.*;
public class Pro10{
public static void main(String[] args)
{

char c1='a';
int i=c1;
if(i>=65 && i<=90)
{
  i=(i+32);

System.out.println((char)i);
}
else
i=(i-32);

System.out.println((char)i);
}
}
