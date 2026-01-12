class object1
{
int x;   //instance(object) member variable
int y;   //instance(object) member variable
void fun1()  //instance(object) member function
{
System.out.println("fun 1");
}
void fun2()   //instance(object) member function
{
System.out.println("fun 2");
}
}
class Lec2a
{
public static void main(String []args)
{
object1 o1 = new object1();
      o1.fun1();
      o1.fun2();
System.out.println(o1.x);
}
}