interface i1
{
int x=8;
void f1();
static void f2()
{
System.out.println(x);
}
}

interface i2 extends i1
{
int x=9;
int y=2;
void f3();
static void f2()
{
System.out.println(x);
}
}

class Demo implements i2
{
public void f1()
{

}
public void f3()
{

}
static void f2()
{
System.out.println(x);
}
}

class interF
{
public static void main(String[] args)
{
//i1.f2();
//i2.f2();
Demo d1=new Demo();
d1.f2();

}
}