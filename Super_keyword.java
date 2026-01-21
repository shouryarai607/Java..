class Example
{
int x;
int y;
void f1(int x,int y)
{
this.x=x;
this.y=y;
}
}

class Example2 extends Example
{
void f3(int x,int y)
{
super.y=y;
super.x=x;
}
void display()
{
System.out.println(super.x);
System.out.println(super.y);
}
}

class Super_keyword
{
public static void main(String []args)
{
//Example e1=new Example();
       // e1.f1(6,9);
       // e1.f2();
Example2 e2=new Example2();
       e2.f3(4,9);
       e2.display();
}
}