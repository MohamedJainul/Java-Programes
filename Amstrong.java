import java.util.Scanner;
public class Amstrong {

public static void main(String args[])
{
int dep,i,sum=0,r;
for(i=100;i<1000;i++)
{
	dep=i;
	while(i>0)
	{
		r=i%10;
		sum=sum+r*r*r;
		i=i/10;
	}
if( sum== dep)
{
	System.out.println(dep);
}
	
}

}
}

