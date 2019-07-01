
package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class JChackBoxDemo extends JFrame{
    private Container c;
    private JCheckBox jb1,jb2;
    private ButtonGroup gp;
    private Font f;
    private JLabel jl;
    
    JChackBoxDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Radio Button");
        this.setBounds(100,100,400,500);
        this.setResizable(false);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.MAGENTA);
 
        f = new Font("Arial",Font.BOLD,18);
        
        gp = new ButtonGroup();
        
        
        jb1 = new JCheckBox("C++");
        jb1.setBounds(50,50,100,50);
        jb1.setToolTipText("Click on box to select");
        c.add(jb1);
        
        jb2 = new JCheckBox("Java");
        jb2.setBounds(50,100,100,50);
        jb2.setToolTipText("Click on box to select");
        c.add(jb2);
        
        gp.add(jb1);
        gp.add(jb2);
        
        jl = new JLabel("You Haven't Selected Anything");
        jl.setBounds(50,150,300,50);
        c.add(jl);
        
        Handler handler = new Handler();
        jb1.addItemListener(handler);
        jb2.addItemListener(handler);

    }
    
    class Handler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getSource() == jb1) jl.setText("You have Selected C++");
            else jl.setText("You have Selected Java");
        }
        
    }
    
    public static void main(String[] args) {
        JChackBoxDemo frame = new JChackBoxDemo();
        frame.setVisible(true);
    }
}
