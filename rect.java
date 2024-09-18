class rectangle
{
int len, wid;
void getdata(int x, int y)
{ len=x;
wid=y;
}
int rectarea()
{ int area=len*wid;
return(area);
}
}
class rect
{ public static void main (String args[])
{ int a1,a2;
rectangle r1= new rectangle();
rectangle r2= new rectangle();
r1.len=15;
r1.wid=10;
a1=r1.len*r1.wid;
r2.getdata(20,12);
a2=r2.rectarea();
System.out.println("Area 1="+a1);
System.out.println("Area 2="+a2);
}
}