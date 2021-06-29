import java.io.*;
class Example
{
void display()
{
Thread g=Thread.currentThread();//g will have current thread
for(int i=0;i<=5;i++)
{
try
{
Thread.sleep(1000);//sleep() is static method we need not createobj
System.out.println(g.getName()+""+i);
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
class Twithoutsynchronization
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

//generally thread exguation will start from  start()method.
// e will be parameterized constructor now directly calls e.display
//now display function of example class will be exguated.
//if u not wrote e.display without writing constructor it doesn't value inside 
//the method. so, for this purpose we are creating object for example classs and 
//we are passing that argument to thread obj.
//sleep and join method will must written in try and catch block.
