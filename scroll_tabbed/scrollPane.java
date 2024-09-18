/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scroll_tabbed;

import javax.swing.*;

/**
 *
 * @author hp
 */
public class scrollPane extends JFrame{
    JTextArea display;
    
    public scrollPane(){
        setTitle("Pane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,100,500,500);
        setVisible(true);
        setLocationRelativeTo(null);
//        setLayout(new FlowLayout());
        display=new JTextArea(10,15);
        display.setSize(100,200);
        
        //JScrollPane works on any-null layout
        /*
        JScrollPane sp = new JScrollPane(display,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setSize(400,400);
        add(sp);
        */
        
        //JTabbPane
        /*
        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(20,40,200,200);
        
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        
        p1.add(new JLabel("1st panel"));
        p2.add(new JLabel("2nd panel"));
        p3.add(new JLabel("3rd panel"));

        tp.add("first",p1);
        tp.add("second",p2);
        tp.add("third",p3);
        add(tp);
        */
        
        JButton btn1=new JButton("Left");
        JButton btn2=new JButton("right");
        
        JSplitPane split=new JSplitPane(JSplitPane.VERTICAL_SPLIT);  
//        JSplitPane split=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

        split.setTopComponent(btn1);
        split.setBottomComponent(btn2);
        
        split.setDividerSize(10);
        split.setDividerLocation(100);
        split.setOneTouchExpandable(true);

        add(split);
//        add(display);
       
        validate();
    }
    public static void main(String[] draj){
        scrollPane sp = new scrollPane();
    }
}
