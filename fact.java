import java.io.*;
import java.util.Scanner;
class fact
{
public static void main (String args[])
{
int n, f=1,a=0;
System.out.println("Enter a number");
Scanner z=new Scanner(System.in);
n=z.nextInt();
for(int i=1; i<n; i++)
{
f=f*i;
a=f*n;
}
System.out.println("Factorial is= "+a);
}
}