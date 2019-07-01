
package Swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JLabel_ImageAdd extends JFrame{
    private Container c;
    private JLabel jl;
    private ImageIcon img;
    
    JLabel_ImageAdd(){
        this.setBounds(100,100,400,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JLabel Image Add");
        this.setResizable(false);
        
        initcomponents();
    }
    
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        img = new ImageIcon(getClass().getResource("view.png"));
        
        jl = new JLabel("PNG LOGO",img,JLabel.LEFT);
        jl.setBounds(50,50,300,200);
        c.add(jl);
    }
    
    public static void main(String[] args) {
        JLabel_ImageAdd frame = new JLabel_ImageAdd();
        frame.setVisible(true);
    }
}
