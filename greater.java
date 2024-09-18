import java.util.Scanner;
class overload
{ 
void great(int m,int n)
{
System.out.println("The Greatest nos is:");
if (m>n)
System.out.println(m);
else
System.out.println(n);
}
void great(float x,float y)
{
System.out.println("The Greatest nos is:");
if (x>y)
System.out.println(x);
else
System.out.println(y);
}
void great(double r,double s)
{System.out.println("The Greatest nos is:");
if (r>s)
System.out.println(r);
else
System.out.println(s);
}
}
class greater
{ public static void main(String args[])
{ overload c=new overload();
c.great(5,3);
c.great(5.1,5.3);
c.great(24.5,3.3);
}
}