package bmsystem;

import javax.swing.*;
import java.awt.*;import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class FastCash extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7;
    JLabel l1;
    String dbcard;
    FastCash(String dbcard){
        this.dbcard=dbcard;
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Design.png"));
    Image i2 = i1.getImage().getScaledInstance(755, 820, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel l2 = new JLabel(i3);
        l2.setBounds(100, 15, 755 , 820);
    add(l2);

        l1 = new JLabel("Fast Cash");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 20));
        l1.setBounds(245, 195, 700, 40);
        l1.setBackground(Color.WHITE);
        l2.add(l1);

        b1 = new JButton("500");
        b2 = new JButton("1000");
        b3 = new JButton("2000");
        b4 = new JButton("5000");
        b5 = new JButton("8000");
        b6 = new JButton("10000");
        b7 = new JButton("BACK");

        b1.setBounds(135,240,150,32);
        b1.setBackground(Color.WHITE);
        l2.add(b1);

        b2.setBounds(300,302,150,32);
        b2.setBackground(Color.WHITE);
        l2.add(b2);

        b3.setBounds(135,302,150,32);
        b3.setBackground(Color.WHITE);
        l2.add(b3);

        b4.setBounds(300,240,150,32);
        b4.setBackground(Color.WHITE);
        l2.add(b4);

        b5.setBounds(135,360,150,32);
        b5.setBackground(Color.WHITE);
        l2.add(b5);

        b6.setBounds(302,360,150,32);
        b6.setBackground(Color.WHITE);
        l2.add(b6);

        b7.setBounds(220,420,150,35);
        b7.setBackground(Color.WHITE);
        l2.add(b7);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setLayout(null);
        setSize(980,1080);
        setLocation(120,0);
        setUndecorated(true);
        setVisible(true);
}
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            JOptionPane.showMessageDialog(null, " 500 Withdrawn Successfully ");
        }if(ae.getSource()==b2){
            JOptionPane.showMessageDialog(null,  " 1000 Withdrawn Successfully ");
        }if(ae.getSource()==b3){
            JOptionPane.showMessageDialog(null,  " 2000 Withdrawn Successfully ");
        }if(ae.getSource()==b4){
            JOptionPane.showMessageDialog(null,  " 5000 Withdrawn Successfully ");
        }if(ae.getSource()==b5){
            JOptionPane.showMessageDialog(null,   " 8000 Withdrawn Successfully ");
        }if(ae.getSource()==b6){
            JOptionPane.showMessageDialog(null,  " 10,000 Withdrawn Successfully ");
        }
        if(ae.getSource()==b7){
            setVisible(false);
            new Transactions(dbcard).setVisible(true);
        }
    }
    public static void main(String[] args){
new FastCash("");
    }
}
