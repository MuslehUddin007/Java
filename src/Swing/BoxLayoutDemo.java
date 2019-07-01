
package Swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class BoxLayoutDemo extends JFrame{
    private Container c;
    private JButton bt1,bt2,bt3;
    private BoxLayout bl;
    
    BoxLayoutDemo(){
        this.setBounds(100,100,400,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Box Layout");        
        initcomponents();
    }
    
    public void initcomponents(){
        c = this.getContentPane();
        bl = new BoxLayout(c,BoxLayout.Y_AXIS);
        c.setLayout(bl);
        c.setBackground(Color.GREEN);
        
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        
        c.add(bt1);
        c.add(Box.createVerticalStrut(10));
        c.add(bt2);
        c.add(Box.createVerticalStrut(10));
        c.add(bt3);
        c.add(Box.createVerticalStrut(10));
        
    }
    
    public static void main(String[] args) {
        BoxLayoutDemo frame = new BoxLayoutDemo();
        frame.setVisible(true);
    }
}
