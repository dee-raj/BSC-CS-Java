/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scroll_tabbed;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class toggle extends JFrame implements ActionListener{
    private Color showCol;
    toggle(){
        setTitle("Dislog ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,200,400,400);
        setLocationRelativeTo(null);
        Container con=getContentPane();
        con.setLayout(null);
        
        showCol=con.getBackground();
        
        JToggleButton tog=new JToggleButton("OFF");
        tog.setBounds(10,20,130,60);
        add(tog);
        
        tog.addActionListener((ActionEvent ae) -> {
            if(tog.isSelected()){
            //on state
            con.setBackground(Color.yellow);
            tog.setText(" ON ");
            }else{
            //off state
            con.setBackground(showCol);
            tog.setText("OFF");
            }
        });
        setVisible(true);
    }
    public static void main(String draj[]){new toggle();}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
