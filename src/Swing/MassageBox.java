package Swing;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Container;

public class MassageBox extends JFrame{
    private ImageIcon icon;
    private Container c;
    
    MassageBox(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,150,400,500);
        setTitle("Frame");
        setResizable(false);
        component();
        
    }
    public void component(){
        c = this.getContentPane();
        c.setBackground(Color.DARK_GRAY);
        
        icon = new ImageIcon(getClass().getResource("view.png"));
        this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) {
        MassageBox frame = new MassageBox();
        frame.setVisible(true);
        
    }
    
}
