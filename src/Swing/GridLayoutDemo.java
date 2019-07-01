
package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame{
    private Container c;
    private JButton bt1,bt2,bt3,bt4;
    private GridLayout gl;
    
    GridLayoutDemo(){
        this.setBounds(100,100,400,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Grid Layout");        
        initcomponents();
    }
    
    public void initcomponents(){
        c = this.getContentPane();
        gl = new GridLayout(2,2,10,10);
        c.setLayout(gl);
        
        
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        
        c.add(bt1);
        c.add(bt2);
        c.add(bt3);
        c.add(bt4);
        
        
    }
    public static void main(String[] args) {
        GridLayoutDemo frame = new GridLayoutDemo();
        frame.setVisible(true);
    }
}
