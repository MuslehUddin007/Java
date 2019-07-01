
package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JComboBoxDemo extends JFrame{
    private Container c;
    private JComboBox jc;
    private Font f;
    private JLabel jl;
    private String[] planguage = {"C","C++","Java","Python","HTML","PHP","C#"};
    
    JComboBoxDemo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Radio Button");
        this.setBounds(100,100,400,500);
        this.setResizable(false);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.MAGENTA);
 
        f = new Font("Arial",Font.BOLD,18);
        
        
        jc = new JComboBox(planguage);
        jc.setBounds(50,150,100,50);
        jc.setEditable(true);
        c.add(jc);
        
        jc.setSelectedIndex(3);
        jc.addItem("MySql");
        //jc.removeItem("MySql");
        //jc.removeItemAt(7);
        //jc.removeAllItems();
        //System.out.println("Total Item: "+jc.getItemCount());
        
        jl = new JLabel("You Haven't Selected Anything");
        jl.setBounds(50,200,300,50);
        c.add(jl);
        
        jc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String s = jc.getSelectedItem().toString();
                jl.setText("You Have Selected "+s);
            }
        });
        

    }
    
    public static void main(String[] args) {
        JComboBoxDemo frame = new JComboBoxDemo();
        frame.setVisible(true);
    }
}
