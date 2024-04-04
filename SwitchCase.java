import java.util.*;
class SwitchCase
{
  public static void main(String[] args)
{ 
  int a=5,b=2;
  Scanner sc=new Scanner(System.in);
  System.out.println("*************");
  System.out.println("*ARITHMETIC OPERATIONS*");
  System.out.println("1. Add");
  System.out.println("2, Sub");
  System.out.println("3. Mul");
  System.out.println("4. Div");
  System.out.println("Enter your choice");
  int ch=sc.nextInt();
  switch(ch)
  {
  case 1-> System.out.println("Addition result is "+(a+b));
  case 2-> System.out.println("Substraction result is "+(a-b));
  case 3-> System.out.println("Multiplication result is "+(a*b));
  case 4-> System.out.println("Division result is "+(a/b));
  default -> System.out.println("Please enter the valid option");
  }
  sc.close();
 }
}