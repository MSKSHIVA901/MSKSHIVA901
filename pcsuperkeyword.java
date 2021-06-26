//superclass
class logic
{
int a=5;
void display()
{
System.out.println("parent class:");
}
}
class child extends logic
{
int a=9;
void display()
{
System.out.println("childclass:");
System.out.println(a);
System.out.println(super.a);//inorder to acces the parent variable using super
super.display();//inorder to acces the parentclassmethod using super
}
}
class pcsuperkeyword
{
public static void main(String args[])
{
child obj=new child();
obj.display();
}
}
//superkeyword is used to access the parent class properties
//like as variables,methods,constructors
//super will be declared in the derivedclass not in base class
//NOTE: varibales and methods will be same in baseclass and derivedclass
//then superkeyword were be used
//in the absence of super there will be recurison will be causeforex:
//in the above program we see that in derivedclass if u remove the super in display method there will be recusion will be causes
//if u want to create constructor for an parentclass and child class our jvm will be exguates first parent constructor by default after it will exguates child
