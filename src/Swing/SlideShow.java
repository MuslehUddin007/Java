
package Swing;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;


public class SlideShow extends JFrame implements ActionListener{
    private Container c;
    private JPanel jp;
    private JButton prebt,nextbt;
    private JLabel jl;
    private CardLayout cl;
    private ImageIcon img;
    
    SlideShow(){
        this.setBounds(100,100,600,600);
        this.setTitle("Slide Show");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        initcomponents();
        showImage();
    }
    
    public void showImage(){
        String[] imageName = {"img1.jpg","img2.jpg","img3.jpg","img4.jpg"};
        
        for(String n : imageName){
            img = new ImageIcon("src/Image/"+n);
            
            //resize image//
            Image image = img.getImage();
            Image newImage = image.getScaledInstance(jp.getWidth(),jp.getHeight(),Image.SCALE_SMOOTH);
            img = new ImageIcon(newImage);
            
            jl = new JLabel(img);
            jp.add(jl);
        }
        
    }
    
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        cl = new CardLayout();
        
        jp =new JPanel(cl);
        jp.setBounds(10,10,570,480);
        c.add(jp);
        
        prebt = new JButton("Previous");
        prebt.setBounds(10,500,100,50);
        prebt.setBackground(Color.DARK_GRAY);
        prebt.setForeground(Color.CYAN);
        c.add(prebt);
        
        nextbt = new JButton("Next");
        nextbt.setBounds(480,500,100,50);
        nextbt.setBackground(Color.DARK_GRAY);
        nextbt.setForeground(Color.CYAN);
        c.add(nextbt);
        
        prebt.addActionListener(this);
        nextbt.addActionListener(this);
    }
    
    public static void main(String[] args) {
        SlideShow frame = new SlideShow();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==prebt) cl.previous(jp);
        else cl.next(jp);
    }
    
}
