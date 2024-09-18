import java.util.Scanner;
class circle
{int r;
final float pi=3.14f;
circle()
{System.out.println("Enter the radius:");
Scanner z=new Scanner(System.in);
r=z.nextInt();
}
void area()
{ float ar=pi*(r*r);
System.out.println("Area of circle:"+ar);
}
void circum()
 { float circ=2*(pi*r);
System.out.println("Circum of circle:"+circ);
}
}
class calc
{public static void main(String args[])
{ circle a=new circle();
a.area();
a.circum();
}
}