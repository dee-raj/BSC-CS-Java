package gui;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class mouseevent extends JFrame implements MouseListener{
    JTextArea display;
    JLabel text;
    public mouseevent(){
        setTitle("Mouse Listener for mouse Events");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,20,550,500);
        Container con=this.getContentPane();
        con.setLayout(null);

        display=new JTextArea();
        display.setBounds(10,20,300,300);
        con.add(display);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);

        text=new JLabel("",SwingConstants.CENTER);
        text.setText("This is label");
        text.setBounds(330,30,200,70);
        text.setFont(new Font("",Font.CENTER_BASELINE,23));
        text.setBorder(new BevelBorder(BevelBorder.LOWERED));
        con.add(text);
        
        text.addMouseListener(this);
        con.setBackground(Color.MAGENTA);
        setVisible(true);  
    }
    public void mouseClicked(MouseEvent e){
        display.setText(display.getText()+"\nmouse is clicked");
    }
    public void mouseEntered(MouseEvent e){
        display.setText("mouse is Entered");
    }
    public void  mouseExited(MouseEvent e){
        display.setText(display.getText()+"\nmouse is Exited");
    }
    public void mousePressed(MouseEvent e){
        display.setText(display.getText()+"\nmouse is pressed");
    }
    public void mouseReleased(MouseEvent e){   
        display.setText(display.getText()+"\nmouse is released");
    }

    public static void main(String draj[]) {
        new mouseevent();
    }
}
