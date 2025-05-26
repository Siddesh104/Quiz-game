
package quze;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    
    JButton b1,b2;
    
    JTextField t1;
    private boolean fales;
    
    Login()
    {
    
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(0,0,600,500);
        add(l1);
        
        
        
        JLabel l2=new JLabel("Simple Minds");
        l2.setBounds(750,60,300,45);
        l2.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        l2.setForeground(new Color (30,144,254)); 
        add(l2);  
        
        JLabel l3=new JLabel("ENETR YOUR NAME");
        l3.setBounds(810,150,300,20);
        l3.setFont(new Font("Viner Hand ITC",Font.BOLD,18));
        l3.setForeground(new Color(30,144,254)); 
        add(l3);  
        
         t1=new JTextField();
        t1.setBounds(735,200,300,25);
        t1.setFont(new Font("Times New Roman",Font.BOLD,28  ));
        add(t1);
        
        
         b1=new JButton("RULES");
        b1.setBounds(735,270,120,25);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(30,144,254));
        b1.setFont(new Font("Relway",Font.BOLD,15));
        b1.addActionListener(this);
        add(b1);
        
         b2=new JButton("BACK");
        b2.setBounds(915,270,125,25);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(30,144,254));
        b2.setFont(new Font("Relway",Font.BOLD,15));
        b2.addActionListener(this);
        add(b2);
        
        setSize(1200,500);
    setLocation(200,200);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b1)
        {
            String name=t1.getText();
         setVisible(fales);
         new Rulse(name);
        }else if(e.getSource()==b2)
        {
        System.exit(0);
        }
        
    }
    public static void main(String args[])
    
    {
    new Login();    
    }

    
}
