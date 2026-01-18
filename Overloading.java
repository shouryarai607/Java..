class Example
{
int x;
int y;
void f1(int x,int y)
{
this.x=x;
this.y=y;
}
void f1()
{
System.out.println("without argument function");
}
void f2()
{
System.out.println(x);
System.out.println(y);

}
}

class Overloading
{
public static void main(String []args)
{
Example e1=new Example();
        e1.f1(6,9);
        e1.f1();
        e1.f2();

}
}