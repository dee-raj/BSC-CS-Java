package gui;
import javax.swing.*;
import java.awt.*;

public class radiobutton {
    JFrame jf;
    JRadioButton rbtn1,rbtn2,rbtn3,r3,r4,r5;
    ButtonGroup gender,car;

    radiobutton(){
        jf=new JFrame("RadioButton");
        jf.setBounds(500,20,500,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=jf.getContentPane();
        c.setLayout(null);

        rbtn1=new JRadioButton("Male");
        rbtn2=new JRadioButton("Female");
        rbtn3=new JRadioButton("TransGender");
        rbtn1.setBounds(20,20,100,30);
        rbtn2.setBounds(200,20,100,30);
        rbtn3.setBounds(350,20,100,30);
        c.add(rbtn1);
        c.add(rbtn2);
        c.add(rbtn3);
        rbtn3.setSelected(true);//if false not select already
        rbtn3.setEnabled(false);//if false not allow to select
        
        gender=new ButtonGroup();
        gender.add(rbtn1);
        gender.add(rbtn2);
        gender.add(rbtn3);

        r3=new JRadioButton("10th");
        r4=new JRadioButton("12th");
        r5=new JRadioButton("UG");
        r3.setBounds(10,90,100,50);
        r4.setBounds(150,90,100,50);
        r5.setBounds(280,90,100,50);
        c.add(r3);
        c.add(r4);
        c.add(r5);

        car=new ButtonGroup();
        car.add(r3);
        car.add(r4);
        car.add(r5);
        r4.setSelected(true);

        c.setBackground(Color.CYAN);
        Font f=new Font("arial",Font.ITALIC,23);
        rbtn1.setFont(f);
        rbtn2.setBackground(Color.pink);
        r5.setFont(f);

        jf.setVisible(true);
    }
    public static void main(String[] Draj){
        new radiobutton();
    }
}
