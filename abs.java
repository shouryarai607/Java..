abstract class demo1
{
int x,y;
demo1()
{
System.out.println("Parent's Constructor");
}
void f1()
{
x=4;
y=8;
}
abstract void f2();
}

class demo2 extends demo1
{
int z;
demo2()
{
System.out.println("Child's Constructor");
}
void f3()
{
z=9;
}
void display()
{
System.out.println(x);
System.out.println(y);
System.out.println(z);
}
void f2()
{
z=10;
}
}

class abs
{
public static void main(String []args)
{
demo2 d1=new demo2();
      d1.f1();
      d1.f3();
      d1.display();
}
}