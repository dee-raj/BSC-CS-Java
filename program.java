import java.util.Scanner;
interface relationalop
{ void relational();
}
interface arthop
{ void arithmetic();
}
class multiple implements relationalop,arthop
{
Scanner z=new Scanner(System.in);
int a=z.nextInt();
int b=z.nextInt();
public void arithmetic()
{ System.out.println("Addition:"+(a+b));
System.out.println("Sub:"+(a-b));
System.out.println("Multi:"+(a*b));
System.out.println("Div:"+(a/b));
}
public void relational()
{ if (a>b)
   {System.out.println(a+ " is greater than "+b);
    }
else if (a==b)
   {System.out.println(a+" is equal than "+b);
    }
 else 
   {System.out.println(a+ " is less than "+b);
    }
}
}
class program
{ public static void main(String args[])
{ System.out.println("Enter 2 nums: "); 
multiple m=new multiple();
m.relational();
m.arithmetic();
}
}