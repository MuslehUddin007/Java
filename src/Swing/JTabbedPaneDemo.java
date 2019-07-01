
package Swing;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class JTabbedPaneDemo extends JFrame{
    private Container c;
    private JTabbedPane tp;
    private JPanel jp1,jp2,jp3;
    private JLabel jl1,jl2,jl3;
    private ImageIcon img1,img2,img3;

    
    JTabbedPaneDemo(){
        this.setBounds(100,100,400,500);
        this.setTitle("JTabbedPane Demo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        initcomponents();
    }
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        
        img1 = new ImageIcon("src/Image/powerButton.png");
        img2 = new ImageIcon("src/Image/off.png");
        img3 = new ImageIcon("src/Image/on.png");
        
        tp = new JTabbedPane(JTabbedPane.TOP);
        tp.setBounds(20,80,350,370);
        c.add(tp);
        
        jl1 = new JLabel("Welcome To Home");
        jl2 = new JLabel("Welcome To Help");
        jl3 = new JLabel("Welcome To Exit");
        
        jp1 = new JPanel();
        jp1.setBackground(Color.DARK_GRAY);
        jp1.add(jl1);
        jp2 = new JPanel();
        jp2.setBackground(Color.LIGHT_GRAY);
        jp2.add(jl2);
        jp3 = new JPanel();
        jp3.setBackground(Color.GRAY);
        jp3.add(jl3);
        
        tp.addTab("Home",img1,jp1,"hello I'm Home Page");
        tp.addTab("Help",img2,jp2);
        tp.addTab("Exit",jp3);
    }
    
    public static void main(String[] args) {
        JTabbedPaneDemo frame = new JTabbedPaneDemo();
        frame.setVisible(true);
    }
}
