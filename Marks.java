import java.util.Scanner;

public class Marks 
{

   public static void main(String[] args) 
   {
      Scanner s = new Scanner ( System.in);
      System.out.print("Enter your name: ");
      String name=s.next();
      System.out.print("Enter marks in three subjects:\n ");
      System.out.println("Subject 1: ");
      int marks1=s.nextInt();
      System.out.println("Subject 2: ");
      int marks2=s.nextInt();
      System.out.println("Subject 3: ");
      int marks3=s.nextInt();
      int m;
      m= marks1+marks2+marks3;
      double average = ( marks1+marks2+marks3)/3.0;
      System.out.println("\nName: "+name);
      System.out.println("Total: "+m);
      System.out.println("Average: "+average);
   }
} 