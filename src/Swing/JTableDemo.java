
package Swing;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;



public class JTableDemo extends JFrame{
    private Container c;
    private JLabel jl;
    private JScrollPane js;
    private Font f;
    private JTable jt;
    private String[] cols = {"ID","Name","CGPA"};
    private String[][] rows = {
      
        {"101","Md Musleh Uddin","3.80"},
        {"102","Md Mujahid Uddin","3.90"},
        {"103","Md Musahid Uddin","3.50"},
        {"104","Md Masudur Rahman","3.60"},
        {"101","Md Musleh Uddin","3.80"},
        {"102","Md Mujahid Uddin","3.90"},
        {"103","Md Musahid Uddin","3.50"},
        {"104","Md Masudur Rahman","3.60"},
        {"101","Md Musleh Uddin","3.80"},
        {"102","Md Mujahid Uddin","3.90"},
        {"103","Md Musahid Uddin","3.50"},
        {"104","Md Masudur Rahman","3.60"},
        
    };
    
    JTableDemo(){
        this.setBounds(100,100,750,500);
        this.setTitle("JTabbedPane Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);
        
        f = new Font("Arial",Font.BOLD,20);
        
        jl = new JLabel("Student Details");
        jl.setBounds(250,20,200,50);
        jl.setForeground(Color.CYAN);
        jl.setFont(f);
        c.add(jl);
        
        jt = new JTable(rows,cols);
        jt.setEnabled(false);
        jt.setSelectionBackground(Color.LIGHT_GRAY);
         
        js = new JScrollPane(jt);
        js.setBounds(50,80,600,200);
        c.add(js);
        
        
    }
    
    public static void main(String[] args) {
        JTableDemo frame = new JTableDemo();
        frame.setVisible(true);
    }
}
