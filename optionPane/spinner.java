/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optionPane;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author hp
 */
public class spinner extends JFrame implements ChangeListener{
    String[] month={"January","february","march","april","may","june","july","august","september","october","november","december"};
    JSpinner s1,s2,s3;
    SpinnerModel sm1,sm2,sm3;
    JLabel lb;
    public spinner(){
    setTitle("spinner test");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        String year=String.valueOf(java.time.Year.now());
        int y=Integer.parseInt(year);
        
        sm1=new SpinnerNumberModel(10,1,31,1);
        sm2=new SpinnerListModel(month);
        sm3=new SpinnerNumberModel(y-19,y-100,y,1);
        
        s1=new JSpinner(sm1);
        s2=new JSpinner(sm2);
        s3=new JSpinner(sm3);
        
        s1.setBounds(120,20,120,50);
        s2.setBounds(120,120,120,50);
        s3.setBounds(120,220,120,50);
        
        lb=new JLabel("Date of birth");
        lb.setBounds(100,350,200,30);
        
        add(s1);
        add(s2);
        add(s3);
        s1.addChangeListener(this);
        s2.addChangeListener(this);
        s3.addChangeListener(this);

        this.setDoB();
        add(lb);
        setVisible(true);
    }
    public static void main(String[] draj){
        new spinner();
    }
    private void setDoB(){
        int dd = (Integer)s1.getValue();
        String mm=(String) s2.getValue();
        int yy = (int) s3.getValue();
        
        lb.setText("DoB is : "+dd+"- "+mm+"- "+yy);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        this.setDoB();
    }
}
