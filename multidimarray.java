import java.util.*;
class multidimarray
{
   public static void main(String[] ar)
  {
   int marks[][]=new int[10][2];
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the rollnumber and marks:");
   for(int i=0;i<marks.length;i++)
   {
   System.out.println("Roll_number:");
   marks[i][0]=sc.nextInt();
   System.out.println("Marks:");
   marks[i][1]=sc.nextInt();
   }
   for(int j=0;j<marks.length;j++)
   {
    System.out.println("roll.no "+marks[j][0]+" marks "+marks[j][1]);
   }
  }
}

   
