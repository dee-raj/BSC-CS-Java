package gui;
import javax.swing.JFrame;
import java.awt.event.*;

public class eventWindow extends JFrame implements WindowListener{
    String q="beauty is nothing without brains";
    public eventWindow(){
        setTitle("windowListener for WindowEvent");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(40,200,400,400);
        
        this.addWindowListener(this);
        setVisible(true);
    }
    public static void main(String draj[]) {
        new eventWindow();
        String breathing="Nothing much...Converting Oxygen into carbon dioxide.";
    }

    public void windowOpened(WindowEvent we){
        System.out.println("windowOpened");
    }

    public void windowClosing(WindowEvent we){
        System.out.println("windowClosing");
    }

    public void windowClosed(WindowEvent we){
        System.out.println("windowClosed");
    }

    public void windowIconified(WindowEvent we){
        System.out.println("windowIconified");
    }

    public void windowDeiconified(WindowEvent we){
        System.out.println("windowDeiconified");
    }

    public void windowActivated(WindowEvent we){
        System.out.println("windowActivated");
    }
    public void windowDeactivated(WindowEvent we){
    System.out.println("windowDeactivated");
    }
}
