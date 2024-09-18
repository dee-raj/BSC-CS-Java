package registation;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.*;
import java.awt.event.*;

public class fillingForm extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JButton submit;
    ButtonGroup gender;
    JTextArea address,display;
    JTextField name,phone;
    JRadioButton m,f,o;
    JCheckBox allow;
    Container con;
    JComboBox day,month,year;
    public fillingForm(){
        setTitle("Fill the Registation Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,20,750,550);
        con=this.getContentPane();
        con.setLayout(null);
        Font font=new Font("",Font.BOLD,19);
        
        l1=new JLabel("        Registation Form");
        l2=new JLabel("Name:");
        l3=new JLabel("Mobile:");
        l4=new JLabel("Gender:");
        l5=new JLabel("DoB:");
        l6=new JLabel("Address:");
        l7=new JLabel();
        l1.setFont(font);
        l2.setFont(font);
        l3.setFont(font);
        l4.setFont(font);
        l5.setFont(font);
        l6.setFont(font);
        l7.setFont(font);
        l1.setFont(new Font("",Font.CENTER_BASELINE,23));
        l1.setBorder(new BevelBorder(BevelBorder.LOWERED));
        l7.setFont(new Font("",Font.HANGING_BASELINE,23));
        

        l1.setBounds(150,5,300,  25);
        l2.setBounds(10,40, 85, 25);
        l3.setBounds(10,75, 85,25);
        l4.setBounds(10,110, 85,25);
        l5.setBounds(10,145,85, 25);
        l6.setBounds(10,180,85, 25);
        l7.setBounds(100,460,400, 45);

        con.add(l1);
        con.add(l2);
        con.add(l3);
        con.add(l4);
        con.add(l5);
        con.add(l6);
        con.add(l7);

        name=new JTextField("");
        phone=new JTextField("");
        name.setBounds(100,40,220,25);
        phone.setBounds(100,75,220,25);
        con.add(name);
        con.add(phone);

        m=new JRadioButton("male");
        f=new JRadioButton("female");
        o=new JRadioButton("other");
        m.setBounds(100,110,60,25);
        f.setBounds(165,110,80,25);
        o.setBounds(250,110,70,25);
        con.add(m);
        con.add(f);
        con.add(o);
        gender=new ButtonGroup();
        gender.add(m);
        gender.add(f);
        gender.add(o);
        m.setSelected(true);
        
        String[] dd ={"01","02","03","04","05","06","07","08" ,"09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" ,"24" ,"25" ,"26" ,"27" ,"28" ,"29" ,"30", "31"};

        String[] mm ={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};

        String[] yy={"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008" ,"2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017"};

        day=new JComboBox<>(dd);
        month=new JComboBox<>(mm);
        year=new JComboBox<>(yy);
        day.setBounds(100,145,50,25);
        month.setBounds(155,145,70,25);
        year.setBounds(230,145,90,25);
        con.add(day);
        con.add(month);
        con.add(year);

        address=new JTextArea("");
        address.setLineWrap(true);
        address.setWrapStyleWord(true);
        address.setBounds(100,180,220,100);
        con.add(address);

        allow=new JCheckBox("accept all the rules and regulations before submiting.");
        allow.setBounds(10,300,330,40);
        con.add(allow);

        submit=new JButton("SUBMIT");
        submit.setBounds(180,350,90,30);
        con.add(submit);
        submit.addActionListener(this);

        display=new JTextArea("nothing is submitted yet!");
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.setBounds(380,50,300,400);
        con.add(display);

        con.setBackground(Color.yellow);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit && phone.getText().length()==10 && name.getText().length()>1 && address.getText().length()>3){
            String dob=year.getSelectedItem()+" "+month.getSelectedItem()+" "+day.getSelectedItem();
            String gen="male";
            if(f.isSelected()){
                gen="female";
            }else if(o.isSelected()){
                gen="other";
            }
            if(allow.isSelected()){
                display.setText(" your name: "+name.getText()+"\nyour mobile number: "+phone.getText()+"\n yourgender: "+gen+"\n your date of birth: "+dob+"\nyour address: "+address.getText());
                
                l7.setText("        Form submittedsuccessfully.");
                l7.setBorder(new BevelBorder(BevelBorder.LOWERED));
                con.setBackground(Color.green);
            } else{
                l7.setText("        accept terms andconditions.");
                con.setBackground(Color.red);
            }
        } else{
            l7.setBounds(3,460,700,50);
            l7.setText("please fill the correct details........... jail jana hai terko dar nhi lagta?");
            con.setBackground(Color.magenta);
        }
    }
    public static void main(String[] draj) {
        new fillingForm();
    }
}