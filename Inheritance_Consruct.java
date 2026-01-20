// inheritance- Constructor 
// and using super(); funtion

class Nokia1
{

private int x,y;
Nokia1(int p,int q)
{
x=p;
y=q;
System.out.println("parent constructor excuted");
}
void f1()
{
System.out.println(x);
System.out.println(y);
}
}

class Nokia2 extends Nokia1
{
Nokia2()
{
super(3,0);
System.out.println("This is Child constructor");
}
void f2()
{
System.out.println("child function 1");
}
}

class Inheritance_Construct
{
public static void main(String []args)
{
Nokia2 n1=new Nokia2();
       n1.f1();
}
}