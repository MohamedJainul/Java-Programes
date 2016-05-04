

public class Arithmetic 	// Class file this java file save Arithmetic.java 

{ 

    public static void main(String[] args)	 //main function the program will start from this.
    
    {   
        
        A a = new A();       //creat object for Class A object name is "a"
        B b = new B();       //creat object for Class b object name is "b"
        C c = new C();       //creat object for Class C object name is "c"
        D d = new D();       //creat object for Class D object name is "d"
                
        a.Add();	// call the Add() fuction in A Class using object "a"
        b.Sub();	// call the Sub() fuction in B Class using object "b"
        c.Mul();	// call the Mul() fuction in C Class using object "c"
        d.Div();	// call the Div() fuction in D Class using object "d"
         
    }
}		//Public Class  is end






class A 		// Class A is created
{

void Add() 		//if the call from PUBLIC Calss the  Add() fuction will be execute

{
       int a=10,b=40,c=a+b;	// variable a,b,c created for this particullar Class A

       System.out.println("addition" );
    System.out.println(" A=10 and B=40 \n answer:"+c );
   
}
}	//Class A is end





class B 		// Class B is created
{
    void Sub ()		//if the call from PUBLIC Calss the  Sub() fuction will be execute
{
 
      int a=40,b=10,c=a-b;  // variable a,b,c created for this particullar Class B

    System.out.println("Subtract" );
    System.out.println(" A=40 and B=10 \n answer:"+c );
    
}
    
}	//Class B is end




class C			// Class C is created
{
    void Mul()		//if the call from PUBLIC Calss the  Mul() fuction will be execute


{
       int a=10,b=40,c=a*b; // variable a,b,c created for this particullar Class C

    System.out.println("Multiply" );
    System.out.println(" A=10 and B=40 \n answer:"+c );
    
}
}	//Class C is end

class D			// Class D is created
{
    void Div()		//if the call from PUBLIC Calss the  Div() fuction will be execute
{
    
       int a=40,b=10,c=a/b; // variable a,b,c created for this particullar Class D
    System.out.println("Division" );
    System.out.println("A=10 and B=40 \n answer:"+c );
    
}
}	//Class D is end