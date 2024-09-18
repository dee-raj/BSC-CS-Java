package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class comboBox{
    JFrame jf;
    Container co;
    JComboBox jb;
    JLabel lb;
    JButton btn;
    comboBox(){
        jf=new JFrame("my Jcombo box");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(400,30,330,402);
        
        co=jf.getContentPane();
        co.setLayout(null);
        
        String[] list={"AND","TOC","IoT","Java"};
        
        jb=new JComboBox(list);
        jb.setBounds(10,20,140,60);
        co.add(jb);

        // jb.setEditable(true);
        // jb.setSelectedItem("Java");
        jb.setSelectedIndex(2);
        jb.addItem("newValue1.0");//one item at a time & will append to the end of list
        jb.addItem("newValue1.1");
        jb.addItem("newValue1.2");
        jb.removeItem("newValue1.1");//remove first occurence item


        btn=new JButton("Show");
        btn.setBounds(30,300,100,30);
        co.add(btn);
        lb=new JLabel("not seen yet.");
        lb.setBounds(20,240,240,60);
        co.add(lb); 

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String value=(String)jb.getSelectedItem();
                lb.setText("The value of selected item: "+value);
                // String value=(String.valueOf(jb.getSelectedIndex()));
                // lb.setText("The index value of selected item: "+value);
                co.setBackground(Color.green);
            }
        }
        );
        jb.setFont(new Font("arial",Font.ITALIC,18));
        jf.setVisible(true);
    }
    public static void main(String[] draj){
        new comboBox();
    }
}