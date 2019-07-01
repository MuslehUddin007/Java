
package Swing;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class windowsListenerDemo extends JFrame{
    private Container c;
    
    windowsListenerDemo(){
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
        
        this.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window Iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window Deiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window Deactivated");
            }
            
        });
    }
    public static void main(String[] args) {
        windowsListenerDemo frame = new windowsListenerDemo();
        frame.setVisible(true);
    }

}
