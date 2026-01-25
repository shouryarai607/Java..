class evenodd
{
void fun(int x)
{
if(x % 2 == 0)
{
System.out.println("Even");
}else{
System.out.println("odd");
}

}
}

class check
{
public static void main(String[] args)
{
evenodd c1=new evenodd();
         c1.fun(7);
}
}