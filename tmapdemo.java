import java.util.TreeMap;
import java.util.Map;
public class tmapdemo
{
public static void main(String args[]){
Map<String,Integer> t=new TreeMap <>();
t.put("Second",2);
t.put("First",1);
System.out.println("Map using tree map:"+t);
t.replace("First",11);
t.replace("Second",22);
System.out.println("New map:"+t);
int value=t.remove("First");
System.out.println("Removed item:"+value);
}
}