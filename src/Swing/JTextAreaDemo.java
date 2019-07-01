
package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class JTextAreaDemo extends JFrame{
    
    private Container c;
    private JTextArea jt;
    private Font f;
    private JScrollPane js;
    
    JTextAreaDemo(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        f = new Font("Remachine Script Personal Use",Font.BOLD + Font.ITALIC,30);
        
        jt = new JTextArea();
        //jt.setBounds(50,50,250,300);
        jt.setFont(f);
        jt.setLineWrap(true);
        jt.setWrapStyleWord(true);
        jt.setBackground(Color.DARK_GRAY);
        jt.setForeground(Color.CYAN);
        //c.add(jt);
        
        js = new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        js.setBounds(50,50,250,300);
        c.add(js);
        
    }
    public static void main(String[] args) {
        JTextAreaDemo frame = new JTextAreaDemo();
        frame.setVisible(true);
        frame.setBounds(100,100,400,500);
        frame.setTitle("JText Area");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
