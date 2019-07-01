
package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MouseListenerDemo extends JFrame{
    private Container c;
    private JTextArea ta;
    private JTextField tf;
    
    MouseListenerDemo(){
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
        
        ta = new JTextArea();
        ta.setBounds(10,10,380,300);
        c.add(ta);
        
        tf = new JTextField();
        tf.setBounds(10,350,380,100);
        c.add(tf);
        
        /*ta.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                tf.setText("Mouse Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                tf.setText("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                tf.setText("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                tf.setText("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tf.setText("Mouse Exited");
            }
            
        });*/
        
        ta.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e) {
                tf.setText("Mouse Dragged "+e.getX()+" "+e.getY());
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                tf.setText("Mouse Moved "+e.getX()+" "+e.getY());
            }
            
        });
        
        
    }
    public static void main(String[] args) {
        MouseListenerDemo frame = new MouseListenerDemo();
        frame.setVisible(true);
    }
}
