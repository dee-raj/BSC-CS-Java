/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scroll_tabbed;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

/**
 *
 * @author hp
 */
public class checkMenu extends JFrame implements ItemListener{
    String dec27="Sometimes holding on does more damage the letting go. Be Thankful For What You Have.";
    JMenuBar menuBar;
    JMenu file, edit, help, format;
    JMenuItem newF, save, close, cut, copy, paste, delete, online, report, about;
    JCheckBoxMenuItem check1,check2;
    JTextArea field;
    public checkMenu() {
        setTitle("Check box menu item");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        menuBar = new JMenuBar();
        add(menuBar, BorderLayout.PAGE_START);

        file = new JMenu("File");
        edit = new JMenu("Edit");
        format = new JMenu("Format");
        help = new JMenu("Help");

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(format);
        menuBar.add(help);

        newF=new JMenuItem("New file/folder");
        save=new JMenuItem("save");
        close=new JMenuItem("close");
        
        cut=new JMenuItem("cut");
        copy=new JMenuItem("copy");
        paste=new JMenuItem("paste");
        delete=new JMenuItem("delete");

        online=new JMenuItem("online");
        report=new JMenuItem("report");
        about=new JMenuItem("about");

        check1=new JCheckBoxMenuItem("Word wrap");
        check2=new JCheckBoxMenuItem("Line wrap");
        
        field=new JTextArea();
        field.setText(dec27);
        add(field,BorderLayout.CENTER);

        file.add(newF);
        file.add(save);
        file.add(close);
        
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(delete);

        format.add(check1);
        format.add(check2);
        check1.addItemListener(this);
        check2.addItemListener(this);

        
        help.add(online);
        help.add(report);
        help.add(about);

        setVisible(true);
    }

    public static void main(String[] draj) {
        checkMenu cm = new checkMenu();
        System.out.println(cm.dec27);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(check1.isSelected()){
            field.setWrapStyleWord(true);
            if(check2.isSelected()){
                field.setLineWrap(true);
            } else{
                field.setLineWrap(false);
            }
        }else{
            field.setWrapStyleWord(false);
        }
    }
}
