
package Swing;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;



public class JColorChooserDemo extends JFrame{
    private Container c;
    private JButton jb;

    
    JColorChooserDemo(){
        this.setBounds(100,100,400,500);
        this.setTitle("JTabbedPane Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        
        jb = new JButton("Choose A Color");
        jb.setBounds(100,50,150,50);
        c.add(jb);
        
        jb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Color color = JColorChooser.showDialog(null,"Select A Color",Color.BLUE);
                c.setBackground(color);
            }
        });
        
    }
    
    public static void main(String[] args) {
        JColorChooserDemo frame = new JColorChooserDemo();
        frame.setVisible(true);
    }
}
