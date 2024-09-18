import java.util.Scanner;
class student
{ int r;
String n;
void getdata()
{Scanner z=new Scanner(System.in);
System.out.println("Enter the name and roll no.: ");
r=z.nextInt();
n=z.nextLine();
}
}
class Display extends student
{ void display()
{System.out.println("The name : "+n);
System.out.println("The roll no.: "+r);
}
}
class single
{ public static void main(String args[])
{ Display d=new Display();
d.getdata();
d.display();
}
}