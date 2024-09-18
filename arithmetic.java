import java.io.*;
import java.util.Scanner;
class arithmetic
{
public static void main (String args[])
{
int a,b;
System.out.println("Enter 2 numbers:");
Scanner z=new Scanner(System.in);
a=z.nextInt();
b=z.nextInt();
System.out.println("Addition: "+(a+b));
System.out.println("Subtraction: "+(a-b));
System.out.println("Multiplication: "+(a*b));
System.out.println("Division: "+(a/b));
}
}