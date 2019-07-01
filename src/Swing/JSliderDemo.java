
package Swing;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;


public class JSliderDemo extends JFrame{
    
    private Container c;
    private JSlider js;
    
    JSliderDemo(){
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
        
        js = new JSlider(JSlider.HORIZONTAL,0,20,0);
        js.setBounds(50,50,300,300);
        js.setMinorTickSpacing(1);
        js.setMajorTickSpacing(5);
        js.setPaintTicks(true);
        js.setPaintLabels(true);
        c.add(js);
        
    }

    public static void main(String[] args) {
        JSliderDemo frame = new JSliderDemo();
        frame.setVisible(true);
    }
}
