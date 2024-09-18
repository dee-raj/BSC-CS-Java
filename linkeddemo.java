import java.util.LinkedList;
import java.util.List;
public class linkeddemo
{
public static void main(String args[]){
List<String> l=new LinkedList <String>();
for(int i=0; i<5; i++){
l.add("item"+i);
}
for(int i=0; i<4; i++){
System.out.println(l.get(i));
}
System.out.println("List  current Length:"+l.size());
l.set(4,"Item 3");
System.out.println(l.remove(4));
System.out.println("List current length:"+l.size());
}
}