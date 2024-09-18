class combinex
{  public static void main(String args[]){  
char c;
String s=null;
int x;
try{
c=s.charAt(10);
x=Integer.parseInt(s);
System.out.println("Value of x:"+x);
}
catch(NullPointerException e)
{ System.out.println(e.getMessage());
}
catch(NumberFormatException y)
{ System.out.println(y.getMessage());
}
}
}