//exception using multipule catchblocks
class multicatch
{
public static void main(String args[])
{
try
{
//opening a file
System.out.println("enter the exception:");
//do some process
int n=args.length;
System.out.println("n="+n);
int a=45/n;
System.out.println("a="+a);
int b[]={23,23,32};
b[40]=100;
}
catch(ArithmeticException ae)
{
//display
System.out.println(ae);
//display
System.out.println("please enter args");
}
catch(ArrayIndexOutOfBoundsException aie)
{
System.out.println(aie);
//display
System.out.println("please enter index of size is limited:");
}
finally
{
//close
System.out.println("closing a file:");
}
}
}