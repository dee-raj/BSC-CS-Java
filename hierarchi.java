import java.util.Scanner;
class staff
{ int code;
String n;
Scanner z=new Scanner(System.in);
}
class teacher extends staff
{ String sub,pub;
teacher()
{ System.out.println("Enter sub-code and Teacher's name :");
code=z.nextInt();
n=z.nextLine();
 System.out.println("Enter subject:");
sub=z.nextLine();
System.out.println("Enter Publication:");
pub=z.nextLine();
}
void display()
{
System.out.println("Teacher's name: (Mr/Ms/Mrs. )"+n+"\n"+"SUb-code:"+code+"\n"+"Subject:"+sub+"\n"+"Publication:"+pub+"\n");
}
}
class officer extends staff
{ String g;
officer()
{ System.out.println("Enter Officer-code and Officer's name :");
code=z.nextInt();
n=z.nextLine();
 System.out.println("Enter Officer Grade:");
g=z.nextLine();
}
void dis()
{
System.out.println("Officer's name:"+n+"\n"+"Code:"+code+"\n"+"Officer's grade:"+g+"\n");
}
}
class typist extends staff
{ 
int speed, salary,dw;

}
class regular extends typist
{ regular()
{System.out.println("Enter code and name of Regular typist :");
code=z.nextInt();
n=z.nextLine();
 System.out.println("Enter speed: ");
speed=z.nextInt();
System.out.println("Enetr Salary:");
salary=z.nextInt();
}
 void data()
{
System.out.println("Regualr Typist's name:"+n+"\n"+"Code:"+code+"\n"+"Speed:"+speed+"\n"+"Salary:"+salary+"\n");
}
}
class casual extends typist
{casual()
{ System.out.println("Enter the name and code of Casual typist:");
code=z.nextInt();
n=z.nextLine();
 System.out.println("Enter speed: ");
speed=z.nextInt();
System.out.println("Enetr daily wages:");
dw=z.nextInt();
}
void otherdata()
{
System.out.println("Casual Typist's name:"+n+"\n"+"Code:"+code+"\n"+"Speed:"+speed+"\n"+"Daily Wages:"+dw+"\n");
}
}
class hierarchi
{ public static void main(String args[])
{ teacher t=new teacher();
t.display();
officer o=new officer();
o.dis();
regular r=new regular();
r.data();
casual c=new casual();
c.otherdata();
}
}