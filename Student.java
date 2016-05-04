import java.io.*;
import java.util.Scanner;
public class Student
{
int RegNo,mark1,mark2,mark3;
static int n,i;
float avg,total;


void display()
{

System.out.println("enter the " + n + " student Register Number:");
Scanner in=new Scanner(System.in);

System.out.println("enter the student Register Number:");
RegNo=in.nextInt();
System.out.println("enter the Mark1 :");
mark1=in.nextInt();
System.out.println("enter the Mark2 :");
mark2=in.nextInt();
System.out.println("enter the Mark3 :");
mark3=in.nextInt();
total=mark1+mark2+mark3;
avg=total/3;



}

void print()
{
	
System.out.println("TOTAL MARKS :" +total+ " \n :AVERAGE:" +avg);
}
public static void main(String args[])
{
	
Student[] link=new Student[10];
System.out.println("enter the total number of students :");
Scanner in=new Scanner(System.in);
n=in.nextInt();
for(i=0;i<=n;i++)
{
	
link.display();

}


for(i=0;i<=n;i++)
{
link.print();	
	
}	
	
}
}
