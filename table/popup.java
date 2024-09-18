/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class popup extends JFrame implements ActionListener{
    JPopupMenu pm;
    JMenuItem m1,m2,m3;
    
    public popup(){
        setTitle("Popup menu");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        
        pm=new JPopupMenu();
        m1=new JMenuItem("refresh");
        m2=new JMenuItem("menu 2");
        m3=new JMenuItem("Exit");

        pm.add(m1);
        pm.add(m2);
        pm.add(m3);

        add(pm);
        
        this.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e){
            if(e.getButton()== MouseEvent.BUTTON3){
                int x=e.getX();
                int y=e.getY();
                pm.show(popup.this, x, y);
            }
        }
        });
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);

    }
    public static void main(String[] draj){
        popup popup = new popup();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==m1){
        System.out.println("referesh successfully!");
        }
        else if(e.getSource()==m2){
            System.out.println("menu 2 selected!");
        }
        else if(e.getSource()==m3){
            System.out.println("Exitted successfully!");
            System.exit(0);
        }

    }
}