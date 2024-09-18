/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optionPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author hp
 */
public class tooltip extends JFrame{
    JLabel la;
    JPasswordField pass;
    String multi="<html>"
            +"<div bgcolor='#0f0f0f' fgcolor='#00f00f'>"
            + "<h2>Enter your password</h2>"
//            + "<br>"
            + "it should be atleast 8 char"
            +"</div>"
            + "</html>";
    
    public tooltip(){
        setTitle("tool tip for the component msg");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(300,220);
        setLayout(null);
        
        la=new JLabel("Password: ");
        la.setBounds(20,20,100,30);
        add(la);
        
        pass=new JPasswordField();
        pass.setBounds(121,20,110,40);
        add(pass);
        pass.setToolTipText(multi);
        
        
        
        setVisible(true);
    }
    public static void main(String[] draj){
        new tooltip();
    }
}
