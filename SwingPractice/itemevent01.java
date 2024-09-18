package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class itemevent01 extends JFrame implements ItemListener{
    JComboBox combo;
    Container c;
    JTextArea show;
    public itemevent01(){
        c=this.getContentPane();
        c.setLayout(null);

        String[] viewList={"explorer","search","run","testing","output","problem"};
        combo=new JComboBox(viewList);
        combo.setBounds(20,10,150,20);

        show=new JTextArea();
        show.setBounds(200,10,200,170);
        c.add(show);

        c.add(combo);
        combo.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie){
        String str=(String)combo.getSelectedItem();
        // String str=combo.getSelectedItem().toString();
        show.setText(str);
        c.setBackground(Color.lightGray);
        if(str=="run"){
            show.setText(str+"ing");
            show.setFont(new Font("",Font.ITALIC,22));
        }if(str=="problem"){
            show.setFont(new Font("",Font.BOLD,19));
            c.setBackground(Color.red);
        }
        int item =(Integer)combo.getSelectedIndex();
        if(item==4){
            show.setText(str+" successful");
            show.setFont(new Font("",Font.ITALIC,24));
            c.setBackground(Color.green);
        }
    }
    public static void main(String draj[]){
        JFrame jf=new itemevent01();
        jf.setTitle("item listener 1st way");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(400,30,600,300);

        jf.setVisible(true);
    }
}