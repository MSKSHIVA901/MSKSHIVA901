//if one tryblock within another tryblock know as nested tryblock.
//nested tryblock
class nestedtryblock
{
//mainmethod
public static void main(String args[])throws Exception
{
try
{
int a[]=new int[10];
//displaying element at index 12
System.out.println(a[12]);
//another tryblock
try
{
System.out.println("divison");
int res=100/0;
}
catch(ArithmeticException ex2)
{
System.out.println("division by zero:");
}
}
catch(ArrayIndexOutOfBoundsException ex1)
{
System.out.println("ArrayIndexofBoundsException:");
}
}
}