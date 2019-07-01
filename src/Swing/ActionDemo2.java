
package Swing;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class ActionDemo2 extends JFrame{
    
    private Container c;
    private JTextField tx1,tx2;
    
    ActionDemo2(){
        content();
    }
    
    public void content(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        tx1 = new JTextField();
        tx1.setBounds(50,20,200,50);
        c.add(tx1);
        
        tx2 = new JTextField();
        tx2.setBounds(50,80,200,50);
        c.add(tx2);
        
        //Action Listener Add//
        
        Handler handler = new Handler();
        tx1.addActionListener(handler);
        tx2.addActionListener(handler);
        
    }
    
    class Handler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==tx1){
                String s = tx1.getText();
            if(s.isEmpty()){
                JOptionPane.showMessageDialog(null,"You didn't entered anything");
            }
            else{
                JOptionPane.showMessageDialog(null,"Text Field 1: "+s);
            }
            }
            else{
                String s = tx2.getText();
            if(s.isEmpty()){
                JOptionPane.showMessageDialog(null,"You didn't entered anything");
            }
            else{
                JOptionPane.showMessageDialog(null,"Text Field 2: "+s);
            }
            }
        }
    }
    
    public static void main(String[] args) {
        
        ActionDemo2 frame = new ActionDemo2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,100,350,450);
        frame.setTitle("Action Demo 2");
        
    }  
}
