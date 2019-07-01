
package Swing;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;


public class TextFieldDemo extends JFrame{
    private Container c;
    private JTextField tx1,tx2;
    private JLabel username,password;
    private Font f;
    
    TextFieldDemo()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,150,400,450);
        setTitle("LOG IN");
        setResizable(false);
        contant();
    }
    
    public void contant()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        
        f = new Font("Arial",Font.BOLD + Font.ITALIC,18);
        
        username = new JLabel("Enter Your UserName: ");
        username.setBounds(50,20,200,50);
        username.setToolTipText("UserName");
        c.add(username);
        tx1 = new JTextField("username");
        tx1.setFont(f);
        tx1.setForeground(Color.WHITE);
        tx1.setBackground(Color.BLACK);
        tx1.setBounds(50,60,200,50);
        tx1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tx1);
        
        password = new JLabel("Enter Your Password");
        password.setBounds(50,100,200,50);
        password.setToolTipText("Password");
        c.add(password);
        tx2 = new JTextField("password");
        tx2.setForeground(Color.WHITE);
        tx2.setBackground(Color.BLACK);
        tx2.setFont(f);       
        tx2.setBounds(50,140,200,50);
        tx2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tx2);
    }
    
    
    
    public static void main(String[] args) {
        TextFieldDemo frame = new TextFieldDemo();
        frame.setVisible(true);
    }
    
}
