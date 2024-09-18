/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optionPane;

import java.awt.event.*;
import javax.swing.*;
public class dialog extends JFrame implements ActionListener{
//    JFrame frame=new JFrame();
    JDialog d;
    public dialog(){
        setTitle("JDialog pane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,200,400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        
        JPanel p=new JPanel();
        add(p);
        
        JButton btn1=new JButton("click");
        btn1.setSize(150,30);
        btn1.addActionListener(this);
        p.add(btn1);
        
        validate();
    }
    public static void main(String draj[]){new dialog();}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("click")){firstDialog();}
        else if(e.getActionCommand().equals("click here")){secondDialog();}

        
    }
    
    private void firstDialog(){
        d=new JDialog(d,"J dialog 1");
        d.setSize(400,400);
        d.add(new JLabel(" label two"));
        
        JPanel pane=new JPanel();
        d.add(pane);
        
        
        JButton btn=new JButton("click here");
        btn.setSize(150,30);
        btn.addActionListener(this);
        pane.add(btn);
        
        d.setVisible(true);
    }
    private void secondDialog(){
        d=new JDialog(this,"J dialog 2");
        d.setSize(200,200);
        
        d.add(new JLabel(" label two"));
        d.setVisible(true);
    }
}
