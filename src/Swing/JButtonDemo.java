
package Swing;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.ImageIcon;


public class JButtonDemo extends JFrame{
    private Container c;
    private JButton bt1,bt2;
    private Cursor cs;
    private ImageIcon img1,img2;
    
    JButtonDemo(){
        setBounds(100,50,400,550);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JButton Field");
        content();
    }
    
    public void content(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        cs = new Cursor(Cursor.HAND_CURSOR);
        
        img1 = new ImageIcon(getClass().getResource("LogIn.png"));
        img2 = new ImageIcon(getClass().getResource("SignUp.png"));
        
        bt1 = new JButton("Submit");
        bt1.setIcon(img1);
        bt1.setBounds(50,20,100,50);
        bt1.setForeground(Color.CYAN);
        bt1.setBackground(Color.DARK_GRAY);
        bt1.setCursor(cs);
        c.add(bt1);
        
        bt2 = new JButton("Clear");
        bt2.setIcon(img2);
        bt2.setBounds(200,20,100,50);
        bt2.setForeground(Color.CYAN);
        bt2.setBackground(Color.DARK_GRAY);
        bt2.setCursor(cs);
        c.add(bt2);
        
    }
    
    public static void main(String[] args) {
        JButtonDemo frame = new JButtonDemo();
        frame.setVisible(true);
    }
}
