class DefaultValueDisplay
{
byte a;
shote b;
int c;
float d;
double e;
long f;
boolean g;
char h;

void display()
{
System.out.println("Default BYTE vlaue is"+a);
System.out.println("Default SHORT vlaue is"+b);
System.out.println("Default INT vlaue is"+c);
System.out.println("Default FLOAT vlaue is"+d);
System.out.println("Default  DOUBLE vlaue is"+e);
System.out.println("Default LONG vlaue is"+f);
System.out.println("Default BOOLEAN vlaue is"+g);
System.out.println("Default CHAR vlaue is"+h);

public static void main(String args[]);
{
DefaultValueDisplay def = new DefaultValueDisplay();
def.display();

}
}