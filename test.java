class student
{
int roll,java,dbms,python;
String name;
void getdata(int r, String n, int d, int e, int f)
{roll=r;
name=n;
java=d; dbms=e; python=f;
}
int avg()
{ int av=(java+dbms+python)/3;
return (av);
}
void display()
{System.out.println(roll+" "+name+" and Avg marks is: "+avg());
}
}
class test
{public static void main(String args[])
{ student a=new student();
System.out.println("The Students info is:");
a.getdata(12124,"Kalyan",15,13,14);
a.display();
a.getdata(12124,"Kinal",19,15,16);
a.display();
a.getdata(12145,"Vivek",14,12,13);
a.display();
}
}