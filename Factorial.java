class Factorial
{
public static void main(String args[])
{
int num=8;

fact(num);
}
static void fact(int num)
{
int f=1;
for(int i=1;i<=num;i++)
{
f=f*i;
}
System.out.println(f);
}
}


