
package Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class KeyListenerVowelCounter extends JFrame{
    private Container c;
    private JTextArea tf;
    private JLabel et,vl,al,el,il,ol,ul;
    private JScrollPane sp;
    
    int total_vowel=0;
    int letter_a = 0;
    int letter_e = 0;
    int letter_i = 0;
    int letter_o = 0;
    int letter_u = 0;
    
    KeyListenerVowelCounter(){
        this.setBounds(100,100,400,500);
        this.setTitle("Vowel Count");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        initcomponents();
    }
    
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        tf = new JTextArea();
        //tf.setBounds(105,10,280,100);
        tf.setForeground(Color.CYAN);
        tf.setBackground(Color.DARK_GRAY);
        tf.setLineWrap(true);
        tf.setWrapStyleWord(true);
        c.add(tf);
        
        sp = new JScrollPane(tf);
        sp.setBounds(105,10,280,100);
        c.add(sp);
        
        et = new JLabel("Enter Any Text: ");
        et.setBounds(5,40,90,50);
        et.setForeground(Color.CYAN);
        c.add(et);
        
        vl = new JLabel();
        vl.setBounds(105,140,200,50);
        vl.setForeground(Color.CYAN);
        c.add(vl);
        
        al = new JLabel();
        al.setBounds(105,170,200,50);
        al.setForeground(Color.CYAN);
        c.add(al);
        
        el = new JLabel();
        el.setBounds(105,190,200,50);
        el.setForeground(Color.CYAN);
        c.add(el);
        
        il = new JLabel();
        il.setBounds(105,210,200,50);
        il.setForeground(Color.CYAN);
        c.add(il);
        
        ol = new JLabel();
        ol.setBounds(105,230,200,50);
        ol.setForeground(Color.CYAN);
        c.add(ol);
        
        ul = new JLabel();
        ul.setBounds(105,250,200,50);
        ul.setForeground(Color.CYAN);
        c.add(ul);
        
        //add key listener//
        tf.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e){
                
            }
            
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getSource()==tf){
                    if(e.getKeyChar() == e.VK_A){
                        total_vowel++;
                        letter_a ++;
                    }
                    if(e.VK_E == e.getKeyChar()){
                        total_vowel++;
                        letter_e ++;
                    }
                    if(e.VK_I == e.getKeyChar()){
                        total_vowel++;
                        letter_i ++;
                    }
                    if(e.VK_O == e.getKeyChar()){
                        total_vowel++;
                        letter_o ++;
                    }
                    if(e.VK_U == e.getKeyChar()){
                        total_vowel++;
                        letter_u ++;
                    }
                }
                
                vl.setText("Total Number Of Vowel: "+total_vowel);
                al.setText("Total Number Of A: "+letter_a);
                el.setText("Total Number Of E: "+letter_e);
                il.setText("Total Number Of I: "+letter_i);
                ol.setText("Total Number Of O: "+letter_o);
                ul.setText("Total Number Of U: "+letter_u);
            }
            
            @Override
            public void keyReleased(KeyEvent e){
                
            }
            
        });
        
    }
    public static void main(String[] args) {
        KeyListenerVowelCounter frame = new KeyListenerVowelCounter();
        frame.setVisible(true);
    }
}
