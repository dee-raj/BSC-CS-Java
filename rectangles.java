import java.util.Scanner;
class paremeter
{int l,b;
paremeter()
{System.out.println("Enter the length and breadth of 1st rectangle:");
Scanner a=new Scanner(System.in);
l=a.nextInt();
b=a.nextInt();
}
paremeter(int e, int f)
{l=e;
b=f;
}
int cal_paremeter()
{int p=2*(l+b);
return p;
}
}
class rectangles
{public static void main(String args[])
{paremeter c=new paremeter();
System.out.println("The Paremeter of 1st rect is:"+c.cal_paremeter());
paremeter d=new paremeter(4,5);
System.out.println("The Paremeter of 1st rect is:"+d.cal_paremeter());
}
}