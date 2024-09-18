/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lookANDfeel;

import javax.swing.*;


/**
 *
 * @author hp
 */
public class lookFeel extends JFrame{
    JLabel name,pass;
    JTextField user,pas;
    JButton clear,login;
    public lookFeel(){
        setTitle("Look And Feel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        setLayout(null);
        
        name=new JLabel("UserName: ");
        pass=new JLabel("Password: ");
        name.setBounds(10,20,150,30);
        pass.setBounds(10,80,150,30);
        add(name);
        add(pass);
        
        user=new JTextField();
        pas=new JTextField();
        user.setBounds(130,20,300,30);
        pas.setBounds(130,80,300,30);
        add(user);
        add(pas);
        
        clear=new JButton("Clear");
        login=new JButton("Login");
        clear.setBounds(80,150,150,50);
        login.setBounds(250,150,150,50);
        add(clear);
        add(login);
        
        setVisible(true);
    }
    public static void main(String draj[])throws Exception{
        String look="javax.swing.plaf.nimbus.NimbusLookAndFeel";
        UIManager.setLookAndFeel(look);

        new lookFeel();
    }
}
