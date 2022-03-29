import java.util.Scanner;
public class Grade
{
     public static void main(String []args)
     {
         try (Scanner sc = new Scanner(System.in)) {
          System.out.println("Enter your grade: ");
              int num=sc.nextInt();
               if(num<50)
               {
                     System.out.println("F grade");
               }
               else if(num>=50 && num<59)
               {
                     System.out.println("D grade");
               }
               else if(num>=60 && num<69)
               {
                    System.out.println("C grade");
               }
               else if(num>=70 && num<79)
               {
                    System.out.println("C+ grade");
               }
               else if(num>=80 && num<99)
               {
                   System.out.println("B grade");
               }
               else if(num>=100)
               {
                   System.out.println("A grade");
               }
               else
               {
                  System.out.println("Fail information!");
               }
     }
     }
}