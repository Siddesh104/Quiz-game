
package quze;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Score extends JFrame implements ActionListener{
    
    JLabel l1,l2;
    JButton b1,b2;
    private boolean fales;
    Score(String name,int score)
    {
    setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i1);
        image.setBounds(0, 2000, 300, 250);
        add(image);
        
        l1 = new JLabel("Thankyou"+ name+ " For Playing");
        l1.setBounds(45, 30, 700, 30);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(l1);
        
        
        l2 = new JLabel("Your Score is "+ score);
        l2.setBounds(350, 300, 300, 30);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(l2);
        
        
        b1=new JButton("Play Again");
        b1.setBounds(200,350,120,30);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(30,144,254));
        b1.setFont(new Font("Relway",Font.BOLD,15));
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Exit");
        b2.setBounds(500,350,120,30);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(30,144,254));
        b2.setFont(new Font("Relway",Font.BOLD,15));
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource()==b1)
        {
        setVisible(fales);
        new Quze("");
        }else if(e.getSource()==b2)
        {
            System.exit(0);
        }
        
    }
    
    public static void main(String args[])
    {
    new Score("User", 0);
    }

   
    
}
