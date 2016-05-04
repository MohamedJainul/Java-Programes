import java.util.Scanner;
class swap
{

public static void main(String args[])
{

 System.out.println("Swap tw0 values");
 
Scanner in=new Scanner(System.in);
        System.out.println("value 1:");
        int a = in.nextInt();
		System.out.println("value 2:");
        int b = in.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value 1:"+a);
		System.out.println("value 2:"+b);
        
		
        
		
		
		

}

}