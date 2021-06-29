//thread with synchronization
import java.io.*;
class Example
{
synchronized void display()
{
Thread g=Thread.currentThread();//g will have current thread
for(int i=0;i<=5;i++)
{
try
{
Thread.sleep(1000);//sleep() is static method we need not createobj
System.out.println(g.getName()+" "+i);
}
catch(Exception e){}
}
}
}
class T extends Thread 
{
Example e;//here we are creating obj for above class
T(Example e)
{
this.e=e;
}
public void run()//this is overriddenfun
{
e.display();
}
}
class Tsynchronization
{
public static void main(String args[])
{
Example ex=new Example();//creating obj
T t1=new T(ex);//here creating obj of thread with parameterizedcons here obj is referenced ex will be assigned to e.
T t2=new T(ex);
T t3=new T(ex);
t1.start();
t2.start();
t3.start();
}
}