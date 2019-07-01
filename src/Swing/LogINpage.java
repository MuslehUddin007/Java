
package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LogINpage extends JFrame{
    private Container c;
    private JLabel username,password;
    private JTextField tx;
    private JPasswordField ps;
    private Font f;
    private JButton bt1,bt2;
    private Cursor cs;
    
    LogINpage(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Log In");
        setBounds(100,100,500,500);
        content();
    }
    
    public void content(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        f = new Font("Arial",Font.BOLD,15);
        
        cs = new Cursor(Cursor.HAND_CURSOR);
        
        username = new JLabel("User Name: ");
        username.setBounds(50,50,150,50);
        username.setFont(f);
        username.setForeground(Color.CYAN);
        c.add(username);
        
        
        password = new JLabel("Password: ");
        password.setFont(f);
        password.setForeground(Color.CYAN);
        password.setBounds(50,150,150,50);
        c.add(password);
        
        tx = new JTextField();
        tx.setBounds(170,50,200,50);
        tx.setBackground(Color.DARK_GRAY);
        tx.setForeground(Color.CYAN);
        tx.setFont(f);
        c.add(tx);
        
        ps = new JPasswordField();
        ps.setBounds(170,150,200,50);
        ps.setBackground(Color.DARK_GRAY);
        ps.setForeground(Color.CYAN);
        ps.setFont(f);
        ps.setEchoChar('#');
        c.add(ps);
        
        
        bt1 = new JButton("Log IN");
        bt1.setBounds(170,250,100,50);
        bt1.setBackground(Color.DARK_GRAY);
        bt1.setForeground(Color.CYAN);
        bt1.setCursor(cs);
        bt1.setToolTipText("Submit Your Information");
        c.add(bt1);
        
        bt2 = new JButton("Clear");
        bt2.setBounds(280,250,100,50);
        bt2.setBackground(Color.DARK_GRAY);
        bt2.setForeground(Color.CYAN);
        bt2.setCursor(cs);
        bt2.setToolTipText("Clear Your Information");
        c.add(bt2);
        
        // clear button //
        bt2.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent e){
                tx.setText("");
                ps.setText("");
            }
        });
        
        // log in button//
        
        bt1.addActionListener(new ActionListener(){
            @Override 
            public void actionPerformed(ActionEvent e){
                String username = tx.getText();
                String password = ps.getText();
                
                if(username.equals("Md Musleh Uddin Khan") && password.equals("12345")){
                    JOptionPane.showMessageDialog(null,"Welcome to Java");
                    //dispose();
                    MoveFrame f = new MoveFrame();
                    f.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid username or password");
                }
            }
        });
        
    }
    
    
    public static void main(String[] args) {
        LogINpage frame = new LogINpage();
        frame.setVisible(true);
    }
}
