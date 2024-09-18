import java.util.Scanner;
class zerodiv
{  public static void main(String args[]){
 int a,b,c;  
Scanner z=new Scanner(System.in);
try{
System.out.println("Enter 2 nums :");
a=z.nextInt();
b=z.nextInt();
c=a/b;
}
catch(ArithmeticException e)
{ System.out.println(e.getMessage());
}
}
}