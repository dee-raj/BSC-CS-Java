import java.util.ArrayList;
import java.util.List;
public class arraydemo
{
public static void main(String args[]){
List<String> al=new ArrayList <String>();
for(int i=0; i<5; i++){
al.add("item"+i);
}
for(int i=0; i<4; i++){
System.out.println(al.get(i));
}
System.out.println("List  current Length:"+al.size());
al.set(4,"Item 9");
System.out.println(al.remove(4));
System.out.println("List current length:"+al.size());
}
}