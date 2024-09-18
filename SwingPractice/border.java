package gui.layout;
import java.awt.*;
import javax.swing.*;

public class border {
    public static void main(String draj[]){
        JButton btn1,btn2,btn3,btn4,btn5;
        JFrame jf=new JFrame("Border Layout");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setBounds(400,100,600,400);

        btn1=new JButton("PAGE_START 1");
        btn2=new JButton("LINE_START 2");
        btn3=new JButton("CENTER 3");
        btn4=new JButton("LINE_END 4");
        btn5=new JButton("PAGE_END 5");   
        
        
        Container con=jf.getContentPane();
        // BorderLayout borderobj=new BorderLayout(10,20);//10,20 => horizontalgap,verticalgap in px
        BorderLayout borderobj=new BorderLayout();
        borderobj.setHgap(14);
        borderobj.setVgap(23);
        con.setLayout(borderobj);
        
        con.add(btn1, BorderLayout.PAGE_START);
        con.add(btn2, BorderLayout.LINE_START);
        con.add(btn3, BorderLayout.CENTER);
        con.add(btn4, BorderLayout.LINE_END);
        con.add(btn5, BorderLayout.PAGE_END);

        jf.setVisible(true);
    }
}
