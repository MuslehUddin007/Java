
package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class FlowLayoutDemo extends JFrame{
    private Container c;
    private JButton button[];
    private FlowLayout fl;
    
    FlowLayoutDemo(){
        this.setBounds(100,100,400,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flow Layout");        
        initcomponents();
    }
    
    public void initcomponents(){
        c = this.getContentPane();
        fl = new FlowLayout(FlowLayout.CENTER);
        fl.setHgap(10);
        fl.setVgap(10);
        c.setLayout(fl);
        
        button = new JButton[9];
        
        for(int i =0;i<9;i++){
            button[i] = new JButton(" "+ (i+1));
            c.add(button[i]);
        }
        
        
        
    }
    
    public static void main(String[] args) {
        FlowLayoutDemo frame = new FlowLayoutDemo();
        frame.setVisible(true);
    }
}
