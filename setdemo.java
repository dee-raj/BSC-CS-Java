import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class setdemo
{
public static void main(String args[]){
Set<String> h=new HashSet <String>();
for(int i=0; i<5; i++){
h.add("item"+i);
h.add("item"+i);
}
for(String item:h){
System.out.println("HashSet:"+item);
}
System.out.println("HashSet  current Length:"+h.size()+'\n');

Set<String> t=new TreeSet <String>();
for(int i=0; i<5; i++){
t.add("item"+i);
t.add("item"+i);
}
for(String item:t){
System.out.println("TreeSet:"+item);
}
System.out.println("TreeSet  current Length:"+t.size());
}
}