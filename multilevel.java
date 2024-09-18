import java.util.Scanner;
class student
{ int r;
String n;
Scanner z=new Scanner(System.in);
void getdata()
{
System.out.println("Enter the name roll no.: ");
r=z.nextInt();
n=z.nextLine();
System.out.println("The name : "+n+" and roll no.: "+r);
}
}
class exam extends student
{ int a,b,c,d,e,f;
void getsub()
{
System.out.println("Enter marks of 6 Subjects:");
a=z.nextInt();
b=z.nextInt();
c=z.nextInt();
d=z.nextInt();
e=z.nextInt();
f=z.nextInt();
System.out.println("English:"+a+"\n"+"Hindi:"+b+"\n"+"Marathi:"+c+"\n"+"Maths:"+d+"\n"+"Science:"+e+"\n"+"Computer:"+f);
}
}
class result extends exam
{
 void display()
{int total;
total=a+b+c+d+e+f;
System.out.println("Total marks:"+total);
}
}
class multilevel
{ public static void main(String args[])
{ result r=new result();
r.getdata();
r.getsub();
r.display();
}
}