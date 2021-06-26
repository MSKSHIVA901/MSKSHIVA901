//using interface
import java.util.*;
class simple implements Runnable
{
//in interface class which implemts Runnable
public void run()
{
Scanner sc=new Scanner(System.in);//here iam taken for my purpose.
System.out.println("enter n values:");
int n= sc.nextInt();
for(int i=0;i<=n;i++)
{
System.out.println(i);
}
}
}
class implementkeywordusingrunnable
{
public static void main(String args[])
{
simple s=new simple();
Thread t=new Thread(s);//we have pass the object to the threadclass.
t.start();
}
}
//as a runnableinterface we are create obj for runnableinterfaceclass.
//second line we are passing obj to threadclass.
//by using t.start() which implictly calls run method.
//because our thread will start with startfunction.
