
package Swing;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class jframe extends JFrame{
    private ImageIcon icon;
    private Container c;
    private JLabel userlabel,password;
    private Font f;
    
    
    jframe()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,150,400,450);
        setTitle("Calculator");
        setResizable(false);
        contant();
    }
    
    public void contant()
    {
        icon = new ImageIcon(getClass().getResource("view.png"));
        this.setIconImage(icon.getImage());
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        f = new Font("Arial",Font.ITALIC,14);
        
        userlabel = new JLabel();
        userlabel.setText("Enter Your Name: ");
        userlabel.setBounds(50,20,200,50);
        userlabel.setFont(f);
        userlabel.setOpaque(true);
        userlabel.setBackground(Color.GREEN);
        userlabel.setForeground(Color.WHITE);
        userlabel.setToolTipText("Hello Mo**erF***er");
        c.add(userlabel);
        
        
        password = new JLabel("Enter you Password: ");
        password.setBounds(50,100,200,50);
        password.setFont(f);
        password.setOpaque(true);
        password.setBackground(Color.blue);
        password.setForeground(Color.WHITE);
        password.setToolTipText("Hello Mo**erF***er");
        c.add(password);
    }
    
    public static void main(String[] args)
    {
        jframe frame = new jframe();
        frame.setVisible(true);
        
    }

    
}
