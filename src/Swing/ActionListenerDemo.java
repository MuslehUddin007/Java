
package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ActionListenerDemo extends JFrame implements ActionListener{
    private Container c;
    private JButton bt1,bt2,bt3;
    ActionListenerDemo(){
        this.setBounds(100,100,400,500);
        this.setTitle("Action Listener Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        bt1 = new JButton("DARK GRAY");
        bt1.setBounds(50,100,100,50);
        c.add(bt1);
        
        bt2 = new JButton("GRAY");
        bt2.setBounds(50,10,100,50);
        c.add(bt2);
        
        bt3 = new JButton("LIGHT GRAY");
        bt3.setBounds(50,200,100,50);
        c.add(bt3);
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bt1) c.setBackground(Color.DARK_GRAY);
        else if(e.getSource() == bt2) c.setBackground(Color.GRAY);
        else c.setBackground(Color.LIGHT_GRAY);
    }
    
    public static void main(String[] args) {
        ActionListenerDemo frame = new ActionListenerDemo();
        frame.setVisible(true);
    }
}
