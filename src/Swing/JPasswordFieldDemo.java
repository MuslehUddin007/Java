
package Swing;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JPasswordField;
import java.awt.Font;

public class JPasswordFieldDemo extends JFrame{
    private Container c;
    private JPasswordField pf;
    private Font f;
    
    JPasswordFieldDemo(){
        setBounds(100,50,400,550);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JPassword Field");
        content();
    }
    
    public void content(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        f = new Font("Arial",Font.BOLD,30);
        
        pf = new JPasswordField();
        pf.setEchoChar('@');
        pf.setBounds(50,20,200,50);
        pf.setBackground(Color.CYAN);
        pf.setForeground(Color.BLACK);
        pf.setFont(f);
        c.add(pf);
    }
    
    public static void main(String[] args) {
        JPasswordFieldDemo frame = new JPasswordFieldDemo();
        frame.setVisible(true);
    }
    
}
