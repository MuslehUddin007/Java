
package Swing;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class ActionDemo1 extends JFrame{
    
    private Container c;
    private JTextField tx1,tx2;
    
    ActionDemo1(){
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
        
        
        tx1.addActionListener(new ActionListener(){  //for tx1//
            
            public void actionPerformed(ActionEvent e){
                String s = tx1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"You didn't enter anything");
                }
                else
                    JOptionPane.showMessageDialog(null,"You Entered: "+s);
            }
            
        });
        
        
        tx2.addActionListener(new ActionListener(){   //for tx2//
            
            public void actionPerformed(ActionEvent e){
                String st = tx2.getText();
                if(st.isEmpty()){
                    JOptionPane.showMessageDialog(null,"You didn't enter anything");
                }
                else
                    JOptionPane.showMessageDialog(null,"You Entered: "+st);
            }
            
        });
    }
    
    
    
    public static void main(String[] args) {
        ActionDemo1 frame = new ActionDemo1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,100,350,500);
        frame.setResizable(false);
        frame.setTitle("Java Frame");
    }
}
