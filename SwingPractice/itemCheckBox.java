package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class itemCheckBox extends JFrame implements ItemListener{
    Container c;
    JCheckBox java,python,cpp,js,db;
    JTextArea show;

    public itemCheckBox(){
        c=this.getContentPane();
        c.setLayout(null);
        
        show=new JTextArea();
        show.setBounds(200,10,300,200);
        show.setLineWrap(true);
        c.add(show);

        java=new JCheckBox("JAVA");
        cpp=new JCheckBox("C++");
        python=new JCheckBox("Python");
        db=new JCheckBox("Database");
        js=new JCheckBox("JavaScript");

        java.setBounds(10,10,100,20);
        python.setBounds(10,40,100,20);
        cpp.setBounds(10,70,100,20);
        db.setBounds(10,100,100,20);
        js.setBounds(10,130,100,20);

        c.add(python);
        c.add(java);
        c.add(cpp);
        c.add(db);
        c.add(js);

        java.addItemListener(this);
        python.addItemListener(this);
        db.addItemListener(this);
        cpp.addItemListener(this);
        js.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie){
        
        if(java.isSelected()){
            c.setBackground(Color.BLUE);
            show.setText("Java");
        }else{
            show.setText("");
        }
        if(python.isSelected()){
            c.setBackground(Color.CYAN);
            show.setText(show.getText().toString()+"\nPython");
        }
        if(db.isSelected()){
            c.setBackground(Color.GRAY);
            show.setText(show.getText().toString()+"\nDatabase");
        }
        if(cpp.isSelected()){
            c.setBackground(Color.GREEN);
            show.setText(show.getText().toString()+"\nC++");
        }
        if(js.isSelected()){
            c.setBackground(Color.MAGENTA);
            show.setText(show.getText().toString()+"\nJavaScript");
        }
        if(js.isSelected()== false && java.isSelected()== false && python.isSelected()== false && db.isSelected()== false && cpp.isSelected()== false){
            c.setBackground(Color.lightGray);
            show.setText("nothing selected yet");
        }
    }
    public static void main(String draj[]){
        JFrame jf=new itemCheckBox();
        jf.setTitle("item listener for CheckBox ");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(400,30,600,300);

        jf.setVisible(true);
    }
}