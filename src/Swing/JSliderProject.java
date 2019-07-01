
package Swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class JSliderProject extends JFrame implements ChangeListener{
    
    private Container c;
    private JLabel jl1,jl2,jl3,jl4;
    private JSlider js1,js2,js3;
    private JTextField tf1,tf2,tf3;
    private JPanel jp;
    
    JSliderProject(){
        this.setBounds(100,100,800,350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JSlider Project");
        this.setResizable(false);
        
        
        initcomponents();
    }
    
    
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        
        //set Label//
        jl1 = new JLabel("Red");
        jl1.setBounds(50,50,80,50);
        c.add(jl1);
        
        jl2 = new JLabel("Green");
        jl2.setBounds(50,110,80,50);
        c.add(jl2);
        
        jl3 = new JLabel("Blue");
        jl3.setBounds(50,170,80,50);
        c.add(jl3);
        
        //set Slider//
        
        js1 = new JSlider(0,255,0);
        js1.setBounds(90,50,300,50);
        js1.setMinorTickSpacing(10);
        js1.setMajorTickSpacing(50);
        js1.setPaintLabels(true);
        js1.setPaintTicks(true);
        c.add(js1);
        
        js2 = new JSlider(0,255,0);
        js2.setBounds(90,110,300,50);
        js2.setMinorTickSpacing(10);
        js2.setMajorTickSpacing(50);
        js2.setPaintLabels(true);
        js2.setPaintTicks(true);
        c.add(js2);
        
        js3 = new JSlider(0,255,0);
        js3.setBounds(90,170,300,50);
        js3.setMinorTickSpacing(10);
        js3.setMajorTickSpacing(50);
        js3.setPaintLabels(true);
        js3.setPaintTicks(true);
        c.add(js3);
        
        //set Text Field//
        
        tf1 = new JTextField();
        tf1.setBounds(400,50,80,40);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);
        
        tf2 = new JTextField();
        tf2.setBounds(400,110,80,40);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf2);
        
        tf3 = new JTextField();
        tf3.setHorizontalAlignment(JTextField.CENTER);
        tf3.setBounds(400,170,80,40);
        c.add(tf3);
        
        //set panel//
        
        jp = new JPanel();
        jp.setBounds(550,50,200,160);
        jp.setBackground(Color.DARK_GRAY);
        c.add(jp);
        
        jl4 = new JLabel("Perview");
        jl4.setBounds(630,200,100,50);
        c.add(jl4);
        
        //change listener add//
        js1.addChangeListener(this);
        js2.addChangeListener(this);
        js3.addChangeListener(this);
        
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        int redvalue = js1.getValue();
        int greenvalue = js2.getValue();
        int bluevalue = js3.getValue();
        
        tf1.setText(""+redvalue);
        tf2.setText(""+greenvalue);
        tf3.setText(""+bluevalue);
        
        Color color = new Color(redvalue,greenvalue,bluevalue);
        jp.setBackground(color);
    }
    
    
    public static void main(String[] args) {
        JSliderProject frame = new JSliderProject();
        frame.setVisible(true);
    }
}
