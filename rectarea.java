class rectangle
{
int l,w,a;
rectangle(int x, int y)
{l=x;
w=y;
}
int area()
{a=l*w;
return (a);
}
}
class rectarea
{ public static void main(String args[])
{ rectangle r=new rectangle(15,20);
System.out.println("The area of rectangle is:"+r.area());
}
}