import java.io.*;
import java.util.Scanner;
class evenodd
{
public static void main (String args[])
{
int n;
System.out.println("Enter a number");
Scanner z=new Scanner(System.in);
n=z.nextInt();
if(n>0)
{
System.out.println("The number is positive:"+n);
if(n%2==0)
{System.out.println("And "+n+" is even");
}
else
System.out.println("But"+n+" is odd");
}
else
System.out.println("The number is negative ");
}
}



