import java.util.*;
class NestedIf
{
  public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your favourite iconic character");
  String act=sc.nextLine();
   if (act.equals("Iron Man"))
  {
   System.out.println("Great choice");
   System.out.println("Enter "+act+" real name");
   String real1=sc.nextLine();
   if (real1.equalsIgnoreCase("tony stark"))
  {
   System.out.println("cool actor");
  }
}
   else
   {
    System.out.println(act);
}
sc.close();
}
}
