class Demo
{
int x,y;
void car()
{
x=2;
y=2;
}
void truck()
{
x=2;
y=4;
}
Demo(int p,int q)  //Parametrized Constructor
{
x=p;
y=q;
}
Demo()          //No-args Constructor
{

}
}

//default constructor rehta hai agar constructor class m ni rehta hai

class Construct
{
public static void main(String []args)
{
Demo d1=new Demo();
System.out.println(d1.x);
System.out.println(d1.y);
    d1.car();
System.out.println(d1.x);
System.out.println(d1.y);
}
}