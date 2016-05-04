class Fibonacci1
{
public static void main(String args[])
{
int f1=0,f2=1,n,i;
System.out.prinln("enter the number of terms:");
scanner a = new scanner(system.in);

System.out.prinln("Fibonacci series are :");
for(i=0;i<=a;i++)
{
if(i<=1)
n=i;
else
{
n=f1+f2;
f1=f2;
f2=n;
}
System.out.prinln("\n"+n);
}

}