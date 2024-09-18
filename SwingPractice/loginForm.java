package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myFrame extends JFrame implements ActionListener{
    Container c;
    JLabel l1,l2;
    JTextField user;
    JPasswordField pass;
    JButton btn;

    myFrame(){
        setTitle("Lofin Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,30,410,500);
        
        c=getContentPane();
        c.setLayout(null);
        
        l1=new JLabel("UserName: ");
        l2=new JLabel("Password: ");
        
        l1.setBounds(10,50,100,23);
        l2.setBounds(10,100,100,23);
        
        c.add(l1);
        c.add(l2);
        
        user=new JTextField();
        user.setBounds(120,50,200,25);
        c.add(user);
        
        pass=new JPasswordField();
        pass.setBounds(120,100,200,25);
        c.add(pass);

        btn=new JButton("Save");
        btn.setBounds(40,200,150,30);
        btn.addActionListener(this);
        c.add(btn);
        
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        
        System.out.println("UserName: "+user.getText());
        System.out.println("Password: "+pass.getText());
    }
}  
public class loginForm {
   public static void main(String Draj[]){
        myFrame mf=new myFrame();
}
}