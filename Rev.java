class Rev
{
 static int[] reverse(int[] list)
{
int[] result = new int[list.length];
for(int i=0,j = 9;i < 10 ;i++,j--)
{
result[j] = list[i];
}
return result;
}	



	
public static void main(String args[])
{
int[] m = {10,13,32,43,54,45,67,2,1,0};
for(int element:m)
{
System.out.println(element);
}

int[] r = reverse(m);
System.out.println("the return array is:");
for(int retelement:r)
{
System.out.println(retelement);
}
}

}