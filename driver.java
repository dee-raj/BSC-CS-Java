class student
{
int roll,year;
String name;
void getdata(int r, String n, int y)
{roll=r;
name=n;
year=y;
}
void display()
{System.out.println("Roll number ="+roll);
System.out.println("Name="+name);
System.out.println("Year="+year);
}
}
class driver
{public static void main(String args[])
{ student a=new student();
a.getdata(1,"Kalyan",2003);
a.display();
}
}