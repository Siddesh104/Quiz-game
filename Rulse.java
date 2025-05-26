
package quze;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Rulse  extends JFrame implements ActionListener {
 
    String name;
    JButton b1,b2;
    private boolean fales;
    
    Rulse(String name)
    {
        this.name=name;
        JLabel l1=new JLabel("WELCOME"  + name +  "TO SIMPLE MINDS");
        l1.setBounds(50,20,700,30);
        l1.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        l1.setForeground(new Color (30,144,254)); 
        add(l1);  
        
        JLabel l2=new JLabel("");
        l2.setBounds(20,90,700,350);
        l2.setFont(new Font("Tahoma",Font.PLAIN,16));
        l2.setText(
                 "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        
        );
        add(l2);
        
       
        
         b1=new JButton("BACK");
        b1.setBounds(250,500,100,30);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(30,144,254));
        b1.setFont(new Font("Relway",Font.BOLD,15));
        b1.addActionListener(this);
        add(b1);
        
         
        b2=new JButton("Start");
        b2.setBounds(400,500,100,30);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(30,144,254));
        b2.setFont(new Font("Relway",Font.BOLD,15));
        b2.addActionListener(this);
        add(b2);
        
        
        
        
        
        
        
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(800,600);
        setLocation(300,100);   
       setVisible(true); 
        
    }
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==b1)
        {
            new Login();
        setVisible(fales);
        
        }else if(e.getSource()==b2)
        {
            setVisible(fales);
        new Quze(name);
        }
        
    }
    
    public static void main(String args[])
    {
    new Rulse("User");
    }

    

}
