
package Ticket_Management_System;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Personal_Information {
    public JTextField fntf,lntf,adtf,phonetf,emailtf;
    public JLabel fntl,lntl,adtl,phonetl,emailtl;
    public Font f;
    
    Personal_Information(){
        
        f = new Font("Arial",Font.BOLD,15);
        
        //jlable add//
        fntl = new JLabel("First Name");
        fntl.setBounds(10,120,80,30);
        fntl.setFont(f);
        fntl.setForeground(Color.CYAN);
        
        lntl = new JLabel("Last Name");
        lntl.setBounds(10,160,80,30);
        lntl.setFont(f);
        lntl.setForeground(Color.CYAN);
        
        adtl = new JLabel("Address");
        adtl.setBounds(10,200,80,30); 
        adtl.setFont(f);
        adtl.setForeground(Color.CYAN);
        
        phonetl = new JLabel("Phone");
        phonetl.setBounds(10,240,80,30);
        phonetl.setFont(f);
        phonetl.setForeground(Color.CYAN);
        
        emailtl = new JLabel("Email");
        emailtl.setBounds(10,280,80,30);
        emailtl.setFont(f);
        emailtl.setForeground(Color.CYAN);
        
        //jtextfield add/
        
        fntf = new JTextField();
        fntf.setBounds(120,120,300,30);
        fntf.setFont(f);
        
        lntf = new JTextField();
        lntf.setBounds(120,160,300,30);
        lntf.setFont(f);
        
        adtf = new JTextField();
        adtf.setBounds(120,200,300,30);
        adtf.setFont(f);
        
        phonetf = new JTextField();
        phonetf.setBounds(120,240,300,30);
        phonetf.setFont(f);
        
        emailtf = new JTextField();
        emailtf.setBounds(120,280,300,30);
        emailtf.setFont(f);
    }
}
