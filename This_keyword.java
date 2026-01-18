class Example
{
private int x;
private int y;
void f1(int x,int y)
{
this.x=x;
this.y=y;
}
void f2()
{
System.out.println(x);
System.out.println(y);
}
}

class This_keyword
{
public static void main(String []args)
{
Example e1=new Example();
        e1.f1(6,9);
        e1.f2();
}
}
