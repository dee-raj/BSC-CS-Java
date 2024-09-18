/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scroll_tabbed;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class list extends JFrame{
//    String[] item={"item one","item two","item three","item four","item five","item six","item seven","item eight","item nine","item ten","item eleven"};
//    JLabel display;
    JTextField ta=new JTextField(10);
    JButton btn1=new JButton("add");
    JButton btn2=new JButton("update");
    JButton btn3=new JButton("delete");
    int index;
    public list(){
        setTitle("JList");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        setVisible(true);
        JPanel pane=new JPanel();
        
//        JList l=new JList(item);
//        l.setVisibleRowCount(5);
        
        //        pane.add(new JScrollPane(l));


//        l.addMouseListener(new MouseAdapter(){
//            @Override
//            public void mouseClicked(MouseEvent e){
//                if(e.getClickCount()==2){
//                  int i= l.getSelectedIndex();
//                  Object item=(String)l.getSelectedValue();
//                  display.setText("Selected index "+i+" selected item "+item);
//                }
//            }
//        });
//        display=new JLabel();
//        pane.add(display);




        //Dynamic list
        setLayout(new GridLayout(1,2));
        JList l=new JList();
        pane.add(new JScrollPane(l));
        
        DefaultListModel model=new DefaultListModel();
        model.addElement("high school");        
        model.addElement("inter");
        model.addElement("bca");

        l.setModel(model);
        
        l.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount()==2){
                    index = l.getSelectedIndex();
                    ta.setText((String)model.get(index));
                }
            }

        });
        add(pane);
        
        JPanel pane2=new JPanel();
        pane2.add(ta);
        pane2.add(btn1);
        pane2.add(btn2);
        pane2.add(btn3);
        
        btn1.addActionListener((ActionEvent e) -> {
            if(!ta.getText().isEmpty()){
               String newItem= ta.getText();
               model.addElement(newItem);
               ta.setText(null);
            }
        });
        btn2.addActionListener((ActionEvent e) -> {
            model.setElementAt(ta.getText(), index);
            ta.setText(null);
        });
        btn3.addActionListener((ActionEvent e) -> {
            model.remove(l.getSelectedIndex());
        });
        
        add(pane2);
        revalidate();
    }
    public static void main(String draj[]){ new list();}
}
