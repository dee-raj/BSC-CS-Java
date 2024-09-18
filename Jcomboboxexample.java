import javax.swing.*;
public class Jcomboboxexample{
JFrame f;
Jcomboboxexample()
{ f=new JFrame("Jcomboboxexample");
String sub[]={"Network Security","ASP .net with c#","Adv. Java","Linux administration","Software Testing"};
JComboBox b=new JComboBox(sub);
b.setBounds(10,10,150,20);
f.add(b);
f.setLayout(null);
f.setSize(200,200);
f.setVisible(true);
}
public static void main(String agrs[]){
new Jcomboboxexample();
}
}