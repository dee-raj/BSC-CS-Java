/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class simpleTable extends JFrame implements ActionListener{
    Object[][] data={
        {01,"Rabi Kumar",23,"Java"},
        {02,"prachand",22,"python"},
        {03,"abdul",24,"C style"},
        {04,"john",31,"kotlin/flutter"},
        {05,"geu-ju",19,"javaScript/mongoDB"}
    };
    static String[] col={"roll no","name","age","coding"};
    JTable table;
    JTextField t1,t2,t4,t3;
    JButton btn1,btn2,btn3,end;
    DefaultTableModel model;
    public simpleTable(){
        setTitle("Table");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,200,700,500);
        setLocationRelativeTo(null);
        //table=new JTable(dataval,col);//metho 01
      
        //method 2 can change table values/model
        model= new DefaultTableModel(data,col);
        table=new JTable(model);
//        add(new JScrollPane(table));
        setLayout(new GridLayout(3,1));
        JPanel pane=new JPanel();
        add(new JScrollPane(table));
        add(new JPanel());
        
        
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        
        btn1=new JButton("ADD");
        btn2=new JButton("update");
        btn3=new JButton("delete");
        end=new JButton("clear");
        
        pane.setLayout(new GridLayout(4,3));
        pane.add(new JLabel("Roll No"));
        pane.add(t1);
        pane.add(btn1);

        pane.add(new JLabel("Name"));
        pane.add(t2);
        pane.add(btn2);

        pane.add(new JLabel("Age"));
        pane.add(t3);
        pane.add(btn3);

        pane.add(new JLabel("Coding"));
        pane.add(t4);
        pane.add(end);
        
        add(pane);
        
        btn1.addActionListener(this);
        btn3.addActionListener(this);
        end.addActionListener(this);

        table.addMouseListener(new MouseListener(){
                @Override
                public void mouseClicked(MouseEvent e) {
                    int rowIndex=table.getSelectedRow();
                    
                    int rollno = (int) model.getValueAt(rowIndex,0);
                    String name= (String) model.getValueAt(rowIndex,1);
                    int age = (int) model.getValueAt(rowIndex,2);
                    String code= (String) model.getValueAt(rowIndex,3);
                    
                    t1.setText(String.valueOf(rollno));
                    t2.setText(name);
                    t3.setText(String.valueOf(age));
                    t4.setText(code);
                }
                @Override
                public void mousePressed(MouseEvent e) {                }
                @Override
                public void mouseReleased(MouseEvent e) {               }
                @Override
                public void mouseEntered(MouseEvent e) {                }
                @Override
                public void mouseExited(MouseEvent e) {                }
            });

        btn2.addActionListener((ActionEvent e) -> {
            if(t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Please select Data from the table!","Not selected yet?",JOptionPane.ERROR_MESSAGE);
                    return;
            }else{
                int rollno=Integer.parseInt(t1.getText());
                String name=t2.getText();
                int age=Integer.parseInt(t3.getText());
                String code=t4.getText();
                
                int rowval=table.getSelectedRow();
                model.setValueAt(rollno, rowval, 0);                
                model.setValueAt(name, rowval, 1);
                model.setValueAt(age, rowval, 2);
                model.setValueAt(code, rowval, 3);
            }
            this.clearValues();
        });
        setVisible(true);
        }
    
    public void clearValues(){
        t1.setText(null);
        t2.setText(null);
        t3.setText(null);
        t4.setText(null);
    }

    @Override
    @SuppressWarnings("UseSpecificCatch")
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==end){
            int check = JOptionPane.showConfirmDialog(new JFrame(), "do you want to clear?");
            if(check==0){
                this.clearValues();
            } return;
        }
        try{
            if(t1.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Please enter values in the fields!","X ERROR",JOptionPane.ERROR_MESSAGE);
                return;
            }
            int rollno=Integer.parseInt(t1.getText());
            String name=t2.getText();
            int age=Integer.parseInt(t3.getText());
            String lang=t4.getText();
            Object[] newdata={rollno,name,age,lang};
            
            if(e.getSource()==btn3){
                
                int check = JOptionPane.showConfirmDialog(null, "do you want to delete this row?","comfirm",JOptionPane.ERROR_MESSAGE);
                if(check==JOptionPane.YES_OPTION){
                    model.removeRow(table.getSelectedRow());
//                    switch(rollno){
//                        case 1 -> model.removeRow(0);
//                        case 2 -> model.removeRow(1);
//                        case 3 -> model.removeRow(2);
//                        case 4 -> model.removeRow(3);
//                        case 5 -> model.removeRow(4);
//                        default -> JOptionPane.showMessageDialog(this, "Roll No does not matched","data not exist",JOptionPane.ERROR_MESSAGE);
//                    }
                    this.clearValues();
                }return;
            }
            if(e.getSource()==btn1){
                if(t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || t4.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Please enter values in the fields!","X ERROR",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                    int check = JOptionPane.showConfirmDialog(new JFrame(), "do you want to add this value?");
                    if(check==0){
                        model.addRow(newdata); 
                        this.clearValues();
                    }
                }
        }catch(NumberFormatException n){
            this.actionPerformed(e);
            JOptionPane.showMessageDialog(this, "Please enter integer values in the fields of Roll No & Age!","Not a Number",JOptionPane.ERROR_MESSAGE);
        } catch(Exception ee){
            System.out.println(ee.getMessage());
        }
   }
    public static void main(String[] draj){
        new simpleTable();
    }
}