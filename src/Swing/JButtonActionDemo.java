
package Swing;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Cursor;

public class JButtonActionDemo extends JFrame{
    
    private Container c;
    private JTextField tx1;
    private JButton bt1;
    private Cursor cs;
    
    JButtonActionDemo(){
        this.setBounds(100,100,350,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("J Button");
        this.setResizable(false);
        
        content();
    }
    
    public void content(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        bt1 = new JButton("Clear");
        cs = new Cursor(Cursor.HAND_CURSOR);
        
        tx1 = new JTextField();
        tx1.setBounds(50,20,200,50);
        c.add(tx1);
        bt1.setBounds(50,80,100,50);
        bt1.setCursor(cs);
        c.add(bt1);
        
        
        bt1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tx1.setText("");
            }
        });
        
    }
    
    
    public static void main(String[] args) {
        JButtonActionDemo frame = new JButtonActionDemo();
        frame.setVisible(true);
    }
}
