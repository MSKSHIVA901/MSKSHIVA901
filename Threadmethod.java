//methods of threadclass:
//.thread is a baseclassfrom that baseclass we deriving ourownclassess.
//.we have somemethods are in thread
//1.start()
//2.run()->this is implicitly called by start()method.
//3.sleep(millionseconds)->the thread will suspended upto given seconds.
// .sleep may through an exception try and catchblock.
//4.join()->join will be used when u implement multipulethreads.
//.....in join after completion of one thread it will goesto another thread.
//......ie.one after another.
//......here also we are writing try and catch block.
//NOTE: we didn't create obj for an sleep()&join() because both will be static method.
//....: we can acces through classname.method.
//5.getId()->gives the id of a thread.
//6.getName()->it always start from thread 0.
//... ex:if u create one thread it may 0.
//....   :if u create two threads itmay o.1.
//.....  like goes.
//7>setname(String)->thread name will be replaced with given string
//....here we should pass one argument on string.
//8.getpriority()->priority ranges from 1 to 10.
//...min.priority-1.
//...norm.Priority-5.//by default it may 5.
//...Max_Priority-10.
//9.setPriority(integer)->setPriority(10)
//10.isAlive()->it will give status of thread.
// ...it returns true if thread is still running.
// ...it returns false if thread completes its exguation.
// ..here allmethods should follow somecases.
// ..sleep and join method should be written in try and catchblock.
// note: every class must be deriving from baseclass.
//prgm 
class th extends Thread
{
public void run()
{
Thread t=currentThread();//current thread gives object referecnce 
//if u createobject as t1 it will not avaiable in scope. 
System.out.println("threadstatus:"+t.isAlive());//itwill prints true or false because boolean
//just remember here are we are using t not t1 because obj of t1 will assigning to t.so here we call t.alive.
for(int i=0;i<=6;i++)
{
try
{
Thread.sleep(1000);//here sleep is staticmethod it can be called by using methodname or Thread.
//if u write sleep in run() object can't access in the thclass so,thatwise when ever we created start() objrefern go to run(). 
//so,thatwise we are creating currentthread in run().
}
catch(Exception e)
{//iam not writng any 
}
System.out.println(i);
}
}
}
class Threadmethod
{
public static void main(String args[])
{
th t1=new th();
th t2=new th();//for join purpose iam creating anotherobj.
System.out.println("ID="+t1.getId());
System.out.println("Name of threadis="+t1.getName());
t1.setName("shiva");//by using setname we can change the  name intiallly it may0.
System.out.println("after changed nameis="+t1.getName());
System.out.println("Priortiy="+t1.getPriority());
t1.setPriority(1);//changing priority
System.out.println("priorityafter changing="+t1.getPriority());
t1.start();//it will invoke runmethod.
try
{
t1.join();//iam writing join in tryblockbecause join can written inonly tryblock
}
catch(Exception e)
{
}
System.out.println("Thread1 status="+t2.isAlive());
t2.start();//iam creating purpose of create join .
//instead of creating obj we can also create another thread class also.
}
}