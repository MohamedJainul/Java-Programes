class Prime1
{
   public static void main (String[] args)
   {	

   int  i,j,n;
   System.out.println("Prime Number");
   for(i=1;i<=100;i++)
    {
	int f=0;
	for(j=1;j<=i;j++)
	{
	 n=i%j;
	 if(n==0)
	 {
	
	 f++;
	  }
	 System.out.println(n);

	 }
        }
     }

   }
}