class family
{
void papa()
{
System.out.println("first class f1");
}
void mummy()
{
System.out.println("first class f2");
}
}

class cousin extends family
{
void didi()
{
System.out.println("Second class f1");
}
}

class practice
{
public static void main(String[] args)
{
cousin c1=new cousin();
       c1.papa();
       c1.mummy();
       c1.didi();
}
}
