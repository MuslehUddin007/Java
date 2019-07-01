
package Swing;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;


public class JToggleButtonDemo extends JFrame implements ActionListener{
    
    private Container c;
    private JToggleButton tb;
    private JLabel jl;
    private ImageIcon imgON,imgOFF;
    
    JToggleButtonDemo(){
        this.setBounds(100,100,400,500);
        this.setTitle("JToggle Button Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        initcomponents();
    }
    
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        imgON = new ImageIcon("src/Image/on.png");
        imgOFF = new ImageIcon("src/Image/off.png");
        
        
        
        
        tb = new JToggleButton(imgOFF);
        tb.setBounds(100,100,90,90);
        c.add(tb);
        
        jl = new JLabel("Hello There");
        jl.setBounds(100,210,100,50);
        jl.setVisible(false);
        c.add(jl);
        
        tb.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(tb.isSelected()){
            tb.setIcon(imgON);
            jl.setVisible(true);
        }
        else{
            tb.setIcon(imgOFF);
            jl.setVisible(false);
        }
    }


    public static void main(String[] args) {
        JToggleButtonDemo frame = new JToggleButtonDemo();
        frame.setVisible(true);
    }
}
