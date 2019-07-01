
package Ticket_Management_System;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Main_Class extends JFrame implements ActionListener{
    private Container c;
    private ImageIcon frameIcon,resetIcon,submitIcon,exitIcon;
    private JButton submitbt,exitbt,resetbt;
    private String cd,t;
    
    //===========//
    Personal_Information person = new Personal_Information();
    FlightType fly = new FlightType();
    receipt rep = new receipt();
    //===========//
    
    Main_Class(){
        this.setBounds(200,50,950,640);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ticket Management System");
        this.setResizable(false);
        
        initcomponents();
    }
    
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        // Frame icon set//
        frameIcon = new ImageIcon(getClass().getResource("AirTicket.png"));
        this.setIconImage(frameIcon.getImage());
        
        resetIcon = new ImageIcon(new ImageIcon("src/Image/reset.png").getImage().getScaledInstance(40,40,Image.SCALE_SMOOTH));
        submitIcon = new ImageIcon("src/Image/paper-plane.png");
        exitIcon = new ImageIcon("src/Image/exit.png");
        
        // jbutton//
        
        submitbt = new JButton(submitIcon);
        submitbt.setBounds(10,500,100,50);
        c.add(submitbt);
        resetbt = new JButton(resetIcon);
        resetbt.setBounds(170,500,100,50);
        c.add(resetbt);
        exitbt = new JButton(exitIcon);
        exitbt.setBounds(320,500,100,50);
        c.add(exitbt);
        
        
        //Head add//
        Heading hd = new Heading();
        c.add(hd.jl);
        
        //Personal Information label//
        /*Personal_Information person = new Personal_Information();*/
        c.add(person.fntl);
        c.add(person.lntl);
        c.add(person.adtl);
        c.add(person.phonetl);
        c.add(person.emailtl);
        
        //Personal Information text field//
        
        c.add(person.fntf);
        c.add(person.lntf);
        c.add(person.adtf);
        c.add(person.phonetf);
        c.add(person.emailtf);
        
        //flight radio button//
        
        /*FlightType fly = new FlightType();*/
        c.add(fly.flight);
        c.add(fly.Adult);
        c.add(fly.Child);
        c.add(fly.stdFlight);
        c.add(fly.ecoFlight);
        c.add(fly.firstFlight);
        c.add(fly.adult);
        c.add(fly.child);
        c.add(fly.desti);
        c.add(fly.destination);
        //receitp textArea//
        
        c.add(rep.receiptLabel);
        c.add(rep.receipt);
        
        // adding action listener//
        exitbt.addActionListener(this);
        resetbt.addActionListener(this);
        submitbt.addActionListener(this);
        
        //***********Current Time*******************//
        
        LocalTime time= LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        t = time.format(dtf);
        System.out.println("Current Time : "+t);
        
        
        //************Current Date**************//
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        cd = df.format(date);
        System.out.println("Current Date : "+cd);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(exitbt)){
            System.exit(0);
        }
        else if(e.getSource().equals(resetbt)){
            person.fntf.setText("");
            person.lntf.setText("");
            person.adtf.setText("");
            person.phonetf.setText("");
            person.emailtf.setText("");
        }
        else if(e.getSource().equals(submitbt)){
            
            if(person.fntf.getText().isEmpty() || person.lntf.getText().isEmpty() || person.adtf.getText().isEmpty() || person.phonetf.getText().isEmpty() || person.emailtf.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Please Fill up all Information","Warning",0);
            }
            else{
            rep.receipt.setText("");
            
            int Total = 0;
            int std = 2000;
            int eco = 3500;
            int first = 5000;
            int india_nepal = 2000,sri_lanka = 2500,canada = 5500,china_japan = 7500,italy = 8000,egypt = 6500,malaysia = 7000,united = 9500;
            
            
            String fnName = person.fntf.getText();
            String lnName = person.lntf.getText();
            String address = person.adtf.getText();
            String phone = person.phonetf.getText();
            String email = person.emailtf.getText();
            
            //cost of the ticket//
            String src = fly.destination.getSelectedItem().toString();
            if(src.equals("Dhaka-to-India") || src.equals("Dhaka-to-Nepal")){
                if(fly.stdFlight.isSelected()){
                    Total = std + india_nepal ;
                }
                else if(fly.ecoFlight.isSelected()){
                    Total = eco + india_nepal;
                }
                else{
                    Total = first + india_nepal;
                }
            }
            else if(src.equals("Dhaka-to-Canada")){
                if(fly.stdFlight.isSelected()){
                    Total = std + canada ;
                }
                else if(fly.ecoFlight.isSelected()){
                    Total = eco + canada;
                }
                else{
                    Total = first + canada;
                }
            }
            else if(src.equals("Dhaka-to-China") || src.equals("Dhaka-to-Japan")){
                if(fly.stdFlight.isSelected()){
                    Total = std + china_japan ;
                }
                else if(fly.ecoFlight.isSelected()){
                    Total = eco + china_japan;
                }
                else{
                    Total = first + china_japan;
                }
            }
            else if(src.equals("Dhaka-to-Italy")){
                if(fly.stdFlight.isSelected()){
                    Total = std + italy ;
                }
                else if(fly.ecoFlight.isSelected()){
                    Total = eco + italy;
                }
                else{
                    Total = first + italy;
                }
            }
            else if(src.equals("Dhaka-to-Egypt")){
                if(fly.stdFlight.isSelected()){
                    Total = std + egypt ;
                }
                else if(fly.ecoFlight.isSelected()){
                    Total = eco + egypt;
                }
                else{
                    Total = first + egypt;
                }
            }
            else if(src.equals("Dhaka-to-Malaysia")){
                if(fly.stdFlight.isSelected()){
                    Total = std + malaysia ;
                }
                else if(fly.ecoFlight.isSelected()){
                    Total = eco + malaysia;
                }
                else{
                    Total = first + malaysia;
                }
            }
            else if(src.equals("Dhaka-to-United States") || src.equals("Dhaka-to-United Arab Emitates")){
                if(fly.stdFlight.isSelected()){
                    Total = std + united ;
                }
                else if(fly.ecoFlight.isSelected()){
                    Total = eco + united;
                }
                else{
                    Total = first + united;
                }
            }
            else if(src.equals("Dhaka-to-Sri Lanka")){
                if(fly.stdFlight.isSelected()){
                    Total = std + sri_lanka ;
                }
                else if(fly.ecoFlight.isSelected()){
                    Total = eco + sri_lanka;
                }
                else{
                    Total = first + sri_lanka;
                }
            }
            
            rep.receipt.append("\t\t\tTravel Management System\n\n"
                +"\n--------------------------------------------------------------------------------------------"
                +"\nName\t:\t"+fnName
                +"\nLast Name\t:\t"+lnName
                +"\nAddress\t:\t"+address
                +"\nPhone\t:\t"+phone
                +"\nEmail\t:\t"+email
                +"\nTotal\t:\t"+Total
                +" tk"
                +"\n--------------------------------------------------------------------------------------------"
                +"\n\tDate: "+cd+"\tTime: "+t
                +"\n\n\n\n\n\n\n\n\n\n\n\t\t\tThanks for Using \n\t\t\tTicket Management System");
        }
    }
    }
    public static void main(String[] args) {
        Main_Class frame = new Main_Class();
        frame.setVisible(true);
    }
}
