/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scroll_tabbed;

/**
 *
 * @author hp
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class separator extends JFrame{
    JMenuBar menuBar;
    JMenu file, edit, help, format;
    JMenuItem newF, save, close,print,exit, cut, copy, paste, delete, online, report, about,undo,redo,find;
    JCheckBoxMenuItem check1,check2;
    JPanel panel;
    public separator() {
        setTitle("Check box menu item");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        menuBar = new JMenuBar();
        add(menuBar, BorderLayout.PAGE_START);

        file = new JMenu("  File  ");
        edit = new JMenu("    Edit    ");
        format = new JMenu("  Format  ");
        help = new JMenu("  Help  ");

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(format);
        menuBar.add(help);

        newF=new JMenuItem("New file/folder");
        save=new JMenuItem("save");
        close=new JMenuItem("close");
        print=new JMenuItem("print");
        exit=new JMenuItem("exit");

        
        undo=new JMenuItem("undo");
        redo=new JMenuItem("redo");
        cut=new JMenuItem("cut");
        copy=new JMenuItem("copy");
        paste=new JMenuItem("paste");
        delete=new JMenuItem("delete");
        find=new JMenuItem("Find");

        online=new JMenuItem("online");
        report=new JMenuItem("report");
        about=new JMenuItem("about");

        check1=new JCheckBoxMenuItem("Word wrap");
        check2=new JCheckBoxMenuItem("Line wrap");
        
        file.add(newF);
        file.add(save);
        file.add(close);
        file.addSeparator();
        file.add(print);
        file.add(exit);
        
        edit.add(undo);
        edit.add(redo);
        edit.addSeparator();
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);        
        edit.addSeparator();
        edit.add(find);
        edit.add(delete);

        format.add(check1);
        format.addSeparator();
        format.add(check2);

        help.add(online);
        help.add(report);
        help.addSeparator();
        help.add(about);

        
        
        panel=new JPanel();
        panel.setLayout(new GridLayout(1,0));
        panel.add(new JLabel("Lebel 1"));   
        panel.add(new JSeparator(SwingConstants.VERTICAL));
        panel.add(new JLabel("Lebel 2"));
        
        add(panel);
        setVisible(true);
    }

    public static void main(String[] draj) {
        separator cm = new separator();
    }
}
