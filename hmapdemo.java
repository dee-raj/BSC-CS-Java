import java.util.HashMap;
import java.util.Map;
public class hmapdemo
{
public static void main(String args[]){
Map<String,Integer> h=new HashMap <>();
h.put("One",1);
h.put("Two",2);
System.out.println("Map:"+h);
System.out.println("Keys:"+h);
System.out.println("Values:"+h);
System.out.println("Entries:"+h);
int value=h.remove("Two");
System.out.println("Removed item:"+value);
}
}