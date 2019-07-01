
package Swing;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class StudentRegistrationProject extends JFrame implements ActionListener{
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scroll;
    private Container c;
    private JLabel titleLabel,fnLabel,lnLabel,phoneLabel,gpaLabel;
    private JTextField fntf,lntf,phonetf,gpatf;
    private JButton addButton,updateButton,deleteButton,clearButton;
    private Font ft,f;
    private String[] cols = {"First Name","Last Name","Phone Number","GPA"};
    private String[] rows = new String[4];
    
    StudentRegistrationProject(){
        this.setBounds(250,30,780,690);
        this.setTitle("Student Registration");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        initcomponents();
    }
    
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);
        
        ft = new Font("Arial",Font.BOLD,20);
        
        // JLabel add//
        titleLabel = new JLabel("Student Registration");
        titleLabel.setBounds(280,10,200,50);
        titleLabel.setForeground(Color.CYAN);
        titleLabel.setFont(ft);
        c.add(titleLabel);
        
        f =new Font("Arial",Font.BOLD,15);
        
        //first line//
        fnLabel  = new JLabel("First Name");
        fnLabel.setBounds(10,90,80,50);
        fnLabel.setForeground(Color.CYAN);
        fnLabel.setFont(f);
        c.add(fnLabel);
        
        fntf = new JTextField();
        fntf.setBounds(120,100,250,30);
        fntf.setFont(f);
        fntf.setForeground(Color.CYAN);
        fntf.setBackground(Color.BLACK);
        c.add(fntf);
        
        addButton = new JButton("ADD");
        addButton.setBounds(430,100,120,30);
        addButton.setFont(f);
        addButton.setBackground(Color.BLACK);
        addButton.setForeground(Color.CYAN);
        c.add(addButton);
        
        //second line//
        lnLabel  = new JLabel("Last Name");
        lnLabel.setBounds(10,140,80,50);
        lnLabel.setForeground(Color.CYAN);
        lnLabel.setFont(f);
        c.add(lnLabel);
        
        lntf = new JTextField();
        lntf.setBounds(120,150,250,30);
        lntf.setFont(f);
        lntf.setForeground(Color.CYAN);
        lntf.setBackground(Color.BLACK);
        c.add(lntf);
        
       updateButton = new JButton("Update");
        updateButton.setBounds(430,150,120,30);
        updateButton.setFont(f);
        updateButton.setBackground(Color.BLACK);
        updateButton.setForeground(Color.CYAN);
        c.add(updateButton);
        
        //third line//
        phoneLabel  = new JLabel("Phone");
        phoneLabel.setBounds(10,190,80,50);
        phoneLabel.setForeground(Color.CYAN);
        phoneLabel.setFont(f);
        c.add(phoneLabel);
        
        phonetf = new JTextField();
        phonetf.setBounds(120,200,250,30);
        phonetf.setFont(f);
        phonetf.setForeground(Color.CYAN);
        phonetf.setBackground(Color.BLACK);
        c.add(phonetf);
        
        deleteButton = new JButton("DELETE");
        deleteButton.setBounds(430,200,120,30);
        deleteButton.setFont(f);
        deleteButton.setBackground(Color.BLACK);
        deleteButton.setForeground(Color.CYAN);
        c.add(deleteButton);
        
        //fourth line//
        gpaLabel  = new JLabel("CGPA");
        gpaLabel.setBounds(10,240,80,50);
        gpaLabel.setForeground(Color.CYAN);
        gpaLabel.setFont(f);
        c.add(gpaLabel);
        
        gpatf = new JTextField();
        gpatf.setBounds(120,250,250,30);
        gpatf.setFont(f);
        gpatf.setForeground(Color.CYAN);
        gpatf.setBackground(Color.BLACK);
        c.add(gpatf);
        
        clearButton = new JButton("CLEAR");
        clearButton.setBounds(430,250,120,30);
        clearButton.setFont(f);
        clearButton.setBackground(Color.BLACK);
        clearButton.setForeground(Color.CYAN);
        clearButton.setForeground(Color.CYAN);
        c.add(clearButton);
        
        //table add//
        
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(cols);
        table.setModel(model);
        table.setFont(f);
        table.setBackground(Color.DARK_GRAY);
        table.setForeground(Color.CYAN);
        table.setSelectionBackground(Color.LIGHT_GRAY);
        table.setRowHeight(30); 
        
        scroll = new JScrollPane(table);
        scroll.setBounds(10,320,750,320);
        c.add(scroll);
        
        //add action listener//
        
        addButton.addActionListener(this);
        clearButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);
        
        
        table.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int numberOFrow = table.getSelectedRow();
                
                String f_name = model.getValueAt(numberOFrow,0).toString();
                String l_name = model.getValueAt(numberOFrow,1).toString();
                String phone_number = model.getValueAt(numberOFrow,2).toString();
                String gpa = model.getValueAt(numberOFrow,3).toString();
                
                fntf.setText(f_name);
                lntf.setText(l_name);
                phonetf.setText(phone_number);
                gpatf.setText(gpa);
                
                
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == addButton){
            rows[0] = fntf.getText();
            rows[1] = lntf.getText();
            rows[2] = phonetf.getText();
            rows[3] = gpatf.getText();
            
            model.addRow(rows);
            
            fntf.setText("");
            lntf.setText("");
            phonetf.setText("");
            gpatf.setText("");
            
        }
        else if(e.getSource() == clearButton){
           fntf.setText("");
           lntf.setText("");
           phonetf.setText("");
           gpatf.setText("");
        }
        else if(e.getSource() == deleteButton){
            int numberOFrow = table.getSelectedRow();
            if(numberOFrow >= 0){
                model.removeRow(numberOFrow);
            }
            else{
                JOptionPane.showMessageDialog(null,"No Row is Selected or not exist","Warring",0);
            }
        }
        
        else if(e.getSource() == updateButton){
            int numberOFrow = table.getSelectedRow();
            
            String f_name = fntf.getText();
            String l_name = lntf.getText();
            String phone_number = phonetf.getText();
            String gpa = gpatf.getText();
            
            model.setValueAt(f_name,numberOFrow,0);
            model.setValueAt(l_name,numberOFrow,1);
            model.setValueAt(phone_number,numberOFrow,2);
            model.setValueAt(gpa,numberOFrow,3);
        }
    }
    public static void main(String[] args) {
        StudentRegistrationProject frame = new StudentRegistrationProject();
        frame.setVisible(true);
    }
}
