//methodoverloading
class A
{
void add()
{
int a=2,b=3;
int c=a+b;
System.out.println("sum="+c);
}
void add(int x,int y)
{
int z=x+y;
System.out.println("sum="+z);
}
}
class Moverload
{
public static void main(String args[])
{
A obj=new A();
obj.add();//by calling firstfunc 
obj.add(2,3);//by calling 2 function
}
}
//note: this will not availble in c,