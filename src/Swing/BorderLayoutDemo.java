
package Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;


public class BorderLayoutDemo extends JFrame{
    private Container c;
    private JButton bt1,bt2,bt3,bt4,bt5;
    private BorderLayout bd;
    
    BorderLayoutDemo(){
        this.setBounds(100,100,400,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Border Layout");        
        initcomponents();
    }
    
    public void initcomponents(){
        c = this.getContentPane();
        bd = new BorderLayout();
        bd.setHgap(10);
        bd.setVgap(10);
        c.setLayout(bd);
        
        
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");
        
        c.add(bt1,BorderLayout.NORTH);
        c.add(bt2,BorderLayout.WEST);
        c.add(bt3,BorderLayout.CENTER);
        c.add(bt4,BorderLayout.EAST);
        c.add(bt5,BorderLayout.SOUTH);
    }
    
    public static void main(String[] args) {
        BorderLayoutDemo frame = new BorderLayoutDemo();
        frame.setVisible(true);
    }
}
