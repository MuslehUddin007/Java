
package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class RadioButtonDemo extends JFrame{
    private Container c;
    private JRadioButton male,female;
    private ButtonGroup gp;
    private JTextArea ta;
    private Font f;
    
    RadioButtonDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Radio Button");
        this.setBounds(100,100,400,500);
        this.setResizable(false);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.MAGENTA);
        
        gp = new ButtonGroup();
        
        f = new Font("Arial",Font.BOLD,18);
        
        male = new JRadioButton("Male");
        male.setBounds(50,50,100,50);
        male.setSelected(true);
        male.setBackground(Color.MAGENTA);
        c.add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(200,50,100,50);
        //female.setEnabled(false);
        female.setBackground(Color.MAGENTA);
        c.add(female);
        
        gp.add(male);
        gp.add(female);
        
        ta = new JTextArea();
        ta.setBounds(10,160,375,300);
        ta.setBackground(Color.DARK_GRAY);
        ta.setForeground(Color.CYAN);
        ta.setFont(f);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        c.add(ta);
        
        Handler handler = new Handler();
        male.addActionListener(handler);
        female.addActionListener(handler);
    }
    
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(male.isSelected()/*e.getSource() == male*/){
                //ta.setText("You Have Selected Male");
                ta.append("You hava Selected Male\n");
            }
            else{
                //ta.setText("You Have Selected Female");
                ta.append("You have Selected Female\n");
            }
        }
    
}
    
    public static void main(String[] args) {
        RadioButtonDemo frame = new RadioButtonDemo();
        frame.setVisible(true);
    }
}
