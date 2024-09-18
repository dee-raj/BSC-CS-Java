import javax.swing.*;
public class swingdemo {
swingdemo()
{ JFrame f=new JFrame("Single-swing application frame demo");
f.setSize(275,100);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel l=new JLabel("Swing means Powerful GUI");
f.add(l);
f.setVisible(true);
}
public static void main(String agrs[]){
new swingdemo();
}
}