//contructor in inheritance mai agrument pass karvane m jyada help karta hain 
//kyuki call toh child hota hai pehle pr excute pehle parent hota hai super() ki help se

class Inherit_constructor
{
public static void main(String []args)
{
nokia2 n2=new nokia2();
}
}

class nokia1
{
int x,y;
nokia1()
{
System.out.println("Parent's Constructor Excuted");
}
void f1()
{
System.out.println("Parent Function 1 Excuted. ");
}
void f2()
{
System.out.println("Parent Function 2 Excuted. ");
}
}
class nokia2 extends nokia1
{
int z;
void f3()
{
System.out.println("Child Function 1 Excuted. ");
}
nokia2()
{
// super();
System.out.println("Child Constructor Excuted");
}
}



