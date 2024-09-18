/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optionPane;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class editor extends JFrame{
    JEditorPane editPane;
    String form="<html>You can edit and prin it out"
            + "<h2 color='blue'>Hello world!</h2>"
            +"<p backgroundcolor='gray'>This is paragraph text</p>"
            + "<hr width='90%'><ol><b>this is list</b>"
            + "<li> item one</li>"
            + "<li> item two</li>"
            + "<li> item three</li>"
            + "</ol><hr>"
            + "</html>";
    public editor(){
        setTitle("Editor Pane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,200,400,400);
        setLocationRelativeTo(null);
        
        JButton btn=new JButton("show code");
        btn.addActionListener((ActionEvent e) -> {
            System.out.println(""+editPane.getText());
        });
        add(btn,BorderLayout.PAGE_END);
        
        editPane=new JEditorPane();
        editPane.setContentType("text/html");
        editPane.setText(form);
        
        add(editPane,BorderLayout.CENTER);
        setVisible(true);
    }
    public static void main(String arg[]){new editor();}
}
