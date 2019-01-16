/* Intialize a character variable in a program and if the value is alphabet then print "Alphabet" if it’s a number then print "Digit"
 and for other characters print "Special Character"
*/



import java.util.*;
public class Pro8{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
char a=sc.next().charAt(0);
if((a>=65 && a<=122))
System.out.println("Alphabet");
 else if((a>=48 && a<=57))
System.out.println("digit");
else{
System.out.println("Special character");
}
}
}