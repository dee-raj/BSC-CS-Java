import javax.swing.*;
import javax.sql.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class updateemp extends JFrame implements ActionListener {
    JButton b;
    JTextField t1, t2, t3;
    JLabel l1, l2, l3;

    public updateemp() {
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        l1 = new JLabel("EID");
        f.add(l1);
        t1 = new JTextField(10);
        f.add(t1);
        l2 = new JLabel("Name");
        f.add(l2);
        t2 = new JTextField(10);
        f.add(t2);
        l3 = new JLabel("Department");
        f.add(l3);
        t3 = new JTextField(10);
        f.add(t3);
        b = new JButton("Update");
        f.add(b);
        b.addActionListener(this);
        f.setSize(200, 200);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost/sycs46", "root", "");
                PreparedStatement s = c.prepareStatement("update employee set name=?,dept=? where eid=?");
                s.setString(1, t2.getText());
                s.setString(2, t3.getText());
                s.setString(3, t1.getText());
                s.executeUpdate();
                System.out.println("Updating employee details");
                s.close();
                c.close();
            } catch (SQLException se) {
                System.out.println("SQL Error");
            } catch (ClassNotFoundException e) {
                System.out.println("Cannot find class");
            }
        }
    }

    public static void main(String args[]) {
        new updateemp();
    }
}
