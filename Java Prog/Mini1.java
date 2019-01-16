import java.util.*;
public class Mini1{
public static void main(String[] args)
{
 String arr[][]={{"Emp no","Emp name","Join Date Code","Dept","Basic","HRA","IT"},
                {"1001","Ashish","1-4-2009","e","R&D","20000","8000","3000"},
                {"1002","Sushma","23-08-2012","c","PM","30000","12000","9000"},
                {"1003","rahul","12-11-2008","k","Acct","10000","8000","1000"},
                {"1004","Rahul","29-01-2013","r","Front Desk","12000","6000","2000"},
                {"1005","Ranjan","16-07-2005","m","Engg","50000","20000","20000"},
                {"1006","Suman","1-1-2000","e","Manufacturing","23000","9000","4400"},
                {"1007","Tanmay","12-06-2006","e","PM","29000","12000","10000"},
                 };

int sel=0;
String Desig=null;
int Salary=0;
String selcode=null;
String ei=args[0];
for(int i=1;i<=7;i++)
{
 if(arr[i][0].equals(ei))

  sel=i;
}
if(sel==0)
System.out.println("Invalid code");
selcode=arr[sel][3];
switch (selcode)
{
  case "e":
{
  Desig="Engineer";
  Salary=Integer.valueOf(arr[sel][5])+Integer.valueOf(arr[sel][6])-Integer.valueOf(arr[sel][7])+20000;
}
case "c":
{
  Desig="Consultant";
  Salary=Integer.valueOf(arr[sel][5])+Integer.valueOf(arr[sel][6])-Integer.valueOf(arr[sel][7])+32000;
}
     case "k":
{
  Desig="Clerk";
  Salary=Integer.valueOf(arr[sel][5])+Integer.valueOf(arr[sel][6])-Integer.valueOf(arr[sel][7])+12000;
}   
case "r":
 {
 Desig="Receptionist";
  Salary=Integer.valueOf(arr[sel][5])+Integer.valueOf(arr[sel][6])-Integer.valueOf(arr[sel][7])+15000;
}
case "m":
 {
 Desig="Manager";
  Salary=Integer.valueOf(arr[sel][5])+Integer.valueOf(arr[sel][6])-Integer.valueOf(arr[sel][7])+40000;
}
}
System.out.println("Emp no  Emp name  Department Designation  salary");
System.out.println(arr[sel][0]+"    "+arr[sel][1]+"     "+arr[sel][4]+"       "+Desig+"      "+Salary);
}
}
