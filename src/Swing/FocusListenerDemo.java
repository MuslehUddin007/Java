
package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class FocusListenerDemo extends JFrame{
    private Container c;
    private JButton bt;
    private JTextArea ta;
    
    FocusListenerDemo(){
        this.setBounds(100,100,400,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Key Listener");
        this.setResizable(false);
        
        initcomponents();
    }
    
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        bt = new JButton("Click");
        bt.setBounds(20,20,100,50);
        c.add(bt);
        
        ta = new JTextArea();
        ta.setBounds(140,20,200,200);
        c.add(ta);
        
        bt.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                ta.setText("Focus Gained");
            }

            @Override
            public void focusLost(FocusEvent e) {
                ta.setText("Focus Lost");
            }
            
        });
    }
    public static void main(String[] args) {
        FocusListenerDemo frame = new FocusListenerDemo();
        frame.setVisible(true);
    }
}
