
package Swing;

import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSpinnerDemo extends JFrame implements ChangeListener{
    private Container c;
    private JSpinner spinner;
    private SpinnerNumberModel value;
    private JLabel jl;
    
    JSpinnerDemo(){
        this.setBounds(100,100,400,500);
        this.setTitle("JSpinner Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        
        value = new SpinnerNumberModel(1,1,12,1);
        
        spinner = new JSpinner(value);
        spinner.setBounds(50,50,70,50);
        c.add(spinner);
        
        jl = new JLabel("You didn't change value");
        jl.setBounds(50,100,200,50);
        c.add(jl);
        
        spinner.addChangeListener(this);
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
        String value = spinner.getValue().toString();
        int val = Integer.parseInt(value);
        
        jl.setText("Current Value: "+val);
        
    }
    
    public static void main(String[] args) {
        JSpinnerDemo frame = new JSpinnerDemo();
        frame.setVisible(true);
    }
}
