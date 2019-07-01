
package Swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MoveFrame extends JFrame{
    
    private Container c;
    private JLabel lav;
    
    MoveFrame(){
        this.setBounds(100,100,400,500);
        this.setTitle("New Frame");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        lav = new JLabel("Welcome to new Frame");
        lav.setBounds(50,50,200,50);
        c.add(lav);
        
    }
    public static void main(String[] args) {
        MoveFrame frame = new MoveFrame();
        frame.setVisible(true);
    }
}
