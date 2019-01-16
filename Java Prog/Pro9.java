/*Write a program to accept gender ("Male" or "Female") and age (1-120) from command line arguments and print the percentage of interest based on the given conditions.
Interest == 8.2% 
 Gender ==> Female
 Age    ==>1 to 58
Interest == 7.6% 
 Gender ==> Female
 Age    ==>59 -120
Interest == 9.2% 
 Gender ==> Male
 Age    ==>1-60
Interest == 8.3% 
 Gender ==> Male
 Age    ==>61-120
*/




import java.util.*;
public class Pro9{
public static void main(String[] args)
{
 String gender=args[0];
int age=Integer.parseInt(args[1]);
if(gender.equals("Male")||gender.equals("Female")&&(age>0 && age<122))
{
 if((gender.equals("Female"))&&(age>=1 && age<=58))
{
 System.out.println("interest = 8.2%");
}
else if((gender.equals("Female"))&&(age>=59 && age<=120))
{
 System.out.println("interest = 8.2%");
}
else if((gender.equals("Male"))&&(age>=1 && age<=60))
{
 System.out.println("interest = 9.2%");
}
else
{
 System.out.println("interest = 8.3%");
}
}
}
}
