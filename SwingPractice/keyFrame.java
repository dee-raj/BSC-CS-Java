package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import gui.keyListenerfortextarea;

public class keyFrame extends JFrame implements KeyListener {
    JTextArea show;
    public keyFrame(){
        Container con=this.getContentPane();
        con.setLayout(null);

        show=new JTextArea(keyListenerfortextarea.quate);
        show.setBounds(10,30,400,250);
        show.setLineWrap(true);
        show.setWrapStyleWord(true);

        show.addKeyListener(this);
        con.add(show);
    }
    @Override
    public void keyPressed(KeyEvent e){
        show.setText("key is pressed :"+e.getKeyChar());
    }
    @Override
    public void keyTyped(KeyEvent e){
        show.setText(show.getText()+"\nkey is typed :"+e.getKeyChar()+" ");

    }
    @Override
    public void keyReleased(KeyEvent e){
        show.setText(show.getText()+"\nkey is released :"+e.getKeyChar());

    }
}
