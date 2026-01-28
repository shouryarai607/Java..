class greater
{
void check(int a, int b,int c)
{
if(a >= b && a >= c ){
System.out.println("a is greater");
}
else if(b >= c && b >= a ){
System.out.println("b is greater");
}
else{
System.out.println("c is greater");
}
}
}

class Greater3check
{
public static void main(String[] args)
{
greater i1=new greater();
    i1.check(4,4,4);
}
}