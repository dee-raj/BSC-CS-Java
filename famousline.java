public interface famousline
{
void showline();
}
class line implements famousline
{ public void showline()
{ System.out.println("My name is kalyan");
}
public static void main(String args[])
{ line l=new line();
l.showline();
}
}
