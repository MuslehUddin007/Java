
package Ticket_Management_System;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;


public class Heading {
    public JLabel jl;
    public Font f;
    
    Heading(){
        
        f = new Font("Arial",Font.BOLD,60);
        
        
        jl = new JLabel("Ticket Management System");
        jl.setBounds(60,5,850,100);
        jl.setFont(f);
        jl.setForeground(Color.CYAN);
        
    }
}
