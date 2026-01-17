class code
{
int x,y,z;
int sum;
void sum2(int p,int q)
{
x=p;
y=q;
sum=x+y;
System.out.println("sum of given no. is:" + sum);
}
void sum3(int p,int q,int r)
{
x=p;
y=q;
z=r;
sum=x+y+z;
System.out.println("sum of given no. is:" + sum);
}
}

class sum
{
public static void main(String []args)
{
code c1=new code();
     c1.sum2(2,7);
     c1.sum3(9,5,3);
}
}