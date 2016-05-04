Simple Fibonacci codeing

class Fibonacci
{
	public static void main(String args[])
	{		
		int prev, next, sum, n;
		prev=next=1;
		for(n=1;n<=20;n++)
		{
			System.out.println(prev);
			sum=prev+next;
			prev=next;
			next=sum;
		}
	}
}
      
