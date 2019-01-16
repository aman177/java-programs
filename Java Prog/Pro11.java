/*Write a program to print the color name, based on color code. 
If color code in not valid then print "Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
*/
import java.util.*;
public class Pro11{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
String ch=sc.next();
switch(ch){
case "R":System.out.print("R->red");
break;
case "B":System.out.print("B->Bule");
break;
case "G":System.out.print("G->green");
break;
case "O":System.out.print("O->orange");
break;
case "Y":System.out.print("Y->yellow");
break;
case "W":System.out.print("W->white");
break;
default:System.out.print("invalid input");
}
}
}