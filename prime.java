import java.io.*;
import java.util.Scanner;
class prime
{
public static void main (String args[])
{
int n, a=0;
System.out.println("Enter a number");
Scanner z=new Scanner(System.in);
n=z.nextInt();
for(int i=2; i<n; i++)
{ if(n%i==0)
{ a++                                                                                                                                                                                                                                           ;
}
}
if(a==0)
System.out.println(n+" is a prime number");
else
System.out.println(n+" is not a prime number");
}
}