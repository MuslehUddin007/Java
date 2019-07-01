
package Swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JPanelDemo extends JFrame{
    private Container c;
    private JPanel jp1,jp2;
    private JButton bt1,bt2,bt3;
    
    JPanelDemo(){
        this.setBounds(100,100,400,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JLabel Image Add");
        this.setResizable(false);
        
        initcomponents();
    }
    
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        
        jp1 = new JPanel();
        jp1.setBounds(50,50,150,300);
        jp1.setBackground(Color.RED);
        c.add(jp1);
        
        jp2 = new JPanel();
        jp2.setBounds(210,50,150,300);
        jp2.setBackground(Color.GREEN);
        c.add(jp2);
        
        jp1.add(bt1);
        jp1.add(bt2);
        jp2.add(bt3);
    }
    
    public static void main(String[] args) {
        JPanelDemo frame = new JPanelDemo();
        frame.setVisible(true);
    }
}
