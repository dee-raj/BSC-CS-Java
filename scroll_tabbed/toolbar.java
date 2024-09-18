/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scroll_tabbed;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class toolbar implements ActionListener{
    JFrame frame;
    JLabel la;
    JToolBar tb=new JToolBar();
    JButton btn1=new JButton("button one");    
    JButton btn2=new JButton("button two");
    JTextField text=new JTextField();
    JComboBox cb=new JComboBox(new String[]{"item 1","item 2","item 3","item 4"});

    public toolbar(){
        frame = new JFrame("Tool Bar example");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tb.add(cb);
        tb.add(text);
        tb.add(btn1);
        tb.addSeparator();
        tb.add(btn2);
        
        cb.addActionListener(this);        
        text.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        la=new JLabel("showing..");
        frame.add(la);
        
        tb.setFloatable(false);
        frame.add(BorderLayout.NORTH,tb);
        frame.setVisible(true);
    }

    public static void main(String draj[]){    new toolbar();    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            la.setText(btn1.getText()+" clicked");
        }else if(e.getSource()==btn2){
            la.setText(btn2.getText()+" clicked");
        }else if(e.getSource()==cb){
            la.setText(cb.getSelectedItem()+" selected");
        }else if(e.getSource()==text){
            la.setText(text.getText()+" TYPED");
        }
    }
}






