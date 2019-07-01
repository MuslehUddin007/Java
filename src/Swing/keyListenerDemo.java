
package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class keyListenerDemo extends JFrame{
    private Container c;
    private JTextField jt;
    private JTextArea ja;
    
    keyListenerDemo(){
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
        
        jt = new JTextField(JTextField.CENTER);
        jt.setBounds(10,10,370,50);
        c.add(jt);
        
        ja = new JTextArea();
        ja.setBounds(10,100,370,300);
        c.add(ja);
        
        jt.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                ja.append("Key Typed: "+e.getKeyChar()+"\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                ja.append("Key Pressed: "+e.getKeyChar()+"\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                ja.append("Key Released: "+e.getKeyChar()+"\n");
            }
            
        });
    }
    
    
    public static void main(String[] args) {
            keyListenerDemo frame = new keyListenerDemo();
            frame.setVisible(true);
    }
}
