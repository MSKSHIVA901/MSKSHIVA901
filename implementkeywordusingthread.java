import java.util.*;
class simple implements Thread
{
void run()
{
System.out.println("new thread");
}
}
class implementkeywordusingrunnable
{
public static void main(String args[])
{
simple t=new simple();
t.start();
}
}