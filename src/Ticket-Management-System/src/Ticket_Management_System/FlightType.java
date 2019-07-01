
package Ticket_Management_System;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class FlightType {
    public JRadioButton stdFlight,ecoFlight,firstFlight,adult,child;
    public JLabel flight,Adult,Child,desti;
    public Font f;
    public ButtonGroup gp;
    public JComboBox destination;
    public String[] place = {"Dhaka-to-India","Dhaka-to-Nepal","Dhaka-to-United Arab Emirates","Dhaka-to-United States","Dhaka-to-Sri Lanka","Dhaka-to-Canada","Dhaka-to-China","Dhaka-to-Japan","Dhaka-to-Italy","Dhaka-to-Egypt","Dhaka-to-Malaysia"};
    
    FlightType(){
        
        f = new Font("Arial",Font.BOLD,15);
        gp = new ButtonGroup();
        
        //label//
        flight = new JLabel("Flight");
        flight.setBounds(10,320,80,30);
        flight.setForeground(Color.CYAN);
        flight.setFont(f);
        
        Adult = new JLabel("Adult");
        Adult.setBounds(10,360,80,30);
        Adult.setForeground(Color.CYAN);
        Adult.setFont(f);
        
        Child = new JLabel("Child");
        Child.setBounds(10,400,80,30);
        Child.setForeground(Color.CYAN);
        Child.setFont(f);
        
        //radio button//
        stdFlight = new JRadioButton("Standard");
        stdFlight.setBounds(120,320,80,30);
        stdFlight.setBackground(Color.BLACK);
        stdFlight.setForeground(Color.CYAN);
        
        ecoFlight = new JRadioButton("Economic");
        ecoFlight.setBounds(220,320,90,30);
        ecoFlight.setBackground(Color.BLACK);
        ecoFlight.setForeground(Color.CYAN);
        
        firstFlight = new JRadioButton("First Class");
        firstFlight.setBounds(310,320,90,30);
        firstFlight.setBackground(Color.BLACK);
        firstFlight.setForeground(Color.CYAN);
        
        adult = new JRadioButton("Yes");
        adult.setBounds(120,360,90,30);
        adult.setBackground(Color.BLACK);
        adult.setForeground(Color.CYAN);
        
        child = new JRadioButton("Yes");
        child.setBounds(120,400,90,30);
        child.setBackground(Color.BLACK);
        child.setForeground(Color.CYAN);
        
        gp.add(stdFlight);
        gp.add(ecoFlight);
        gp.add(firstFlight);
        
        //comboBox//
        desti = new JLabel("Destination");
        desti.setBounds(10,440,90,30);
        desti.setBackground(Color.BLACK);
        desti.setForeground(Color.CYAN);
        desti.setFont(f);
        
        destination = new JComboBox(place);
        destination.setBounds(120,440,300,30);
    }
}
