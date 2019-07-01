
package Swing;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutDemo extends JFrame implements ActionListener{
    private Container c;
    private JButton bt1,bt2,bt3,bt4;
    private CardLayout cl;
    
    CardLayoutDemo(){
        this.setBounds(100,100,400,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Card Layout");        
        initcomponents();
    }
    
    public void initcomponents(){
        c = this.getContentPane();
        cl = new CardLayout(10,10);
        c.setLayout(cl);
        
        
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        
        c.add(bt1,"first");
        c.add(bt2,"second");
        c.add(bt3,"third");
        c.add(bt4,"fourth");
        //cl.show(c,"thrid");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        cl.next(c);
        //cl.previous(c);
        //cl.show(c,"thrid");
        //cl.last(c);
        //cl.first(c);
    }
    
    public static void main(String[] args) {
        CardLayoutDemo frame = new CardLayoutDemo();
        frame.setVisible(true);
    }
}
