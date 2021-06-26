import java.util.*;
class single extends Thread
{
public void run()//run is override
{
for(int i=0;i<5;i++)
{
System.out.println(i);
}
}
}
class singlethread
{
public static void main(String args[])
{
single t=new single();//new thread will be created
t.start();//it will calls the run() which is present in class single.
}
}
