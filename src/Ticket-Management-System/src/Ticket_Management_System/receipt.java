
package Ticket_Management_System;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class receipt {
    public JTextArea receipt;
    public JLabel receiptLabel;
    public Font f;
    public JScrollPane scroll;
    
    receipt(){
        f = new Font("Arial",Font.BOLD,20);

        receiptLabel = new JLabel("Receipt");
        receiptLabel.setBounds(480,105,200,50);
        receiptLabel.setForeground(Color.CYAN);
        receiptLabel.setFont(f);
        
        
        
        receipt = new JTextArea();
        receipt.setBounds(480,160,420,390);
        receipt.setLineWrap(true);
        receipt.setWrapStyleWord(true);
        receipt.setForeground(Color.CYAN);
        receipt.setBackground(Color.DARK_GRAY);
        
        /*scroll = new JScrollPane(receipt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //scroll.setBounds(480,160,400,390);
        receipt.add(scroll);*/
        
    }
}
