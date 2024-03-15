import java.util.*;
class mathoperation
{
   public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Values of a & b:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Addition of "+a+" + "+b+" is "+(a+b));
    System.out.println("Substraction of "+a+" - "+b+" is "+(a-b));
    System.out.println("Multiplication of "+a+" * "+b+" is "+(a*b));
    if (b!= 0)
      System.out.println("Division of "+a+"/"+b+" is "+(a/b));
    else
      System.out.println ("We cannot divide "+a+" by zero");
  }
}