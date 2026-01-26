class greater
{
void check(int a, int b)
{
if(a < b ){
System.out.println("b is greater");
}
else if(a > b ){
System.out.println("a is greater");
}
else{
System.out.println("both are equal");
}
}
}

class Greater2check
{
public static void main(String[] args)
{
greater i1=new greater();
        i1.check(4,4);
}
}