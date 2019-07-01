
package Swing;

import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


public class JMenuDemo extends JFrame implements ActionListener{
    private Container c;
    private JMenuBar menubar;
    private JMenu file,edit,help;
    private JMenuItem newFile,openFile,exitItem,CutItem,CopyItem,PasteItem,SelectAll;
    private ImageIcon cutIcon,copyIcon,pasteIcon,exitIcon,newIcon;
    
    
    JMenuDemo(){
        this.setBounds(100,100,400,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JMenu Demo");
        this.setResizable(false);
        
        initcomponents();
    }
    
    public void initcomponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        
        cutIcon = new ImageIcon("src/Image/cut.png");
        copyIcon = new ImageIcon("src/Image/copy.png");
        pasteIcon = new ImageIcon("src/Image/paste.png");
        exitIcon = new ImageIcon("src/Image/exit.png");
        newIcon = new ImageIcon("src/Image/new.png");
        
        menubar = new JMenuBar();
        this.setJMenuBar(menubar);
        
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        
        menubar.add(file);
        menubar.add(edit);
        menubar.add(help);
        
        newFile = new JMenuItem("New File");
        newFile.setIcon(newIcon);
        newFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        openFile = new JMenuItem("Open File");
        exitItem = new JMenuItem("Exit Item");
        exitItem.setIcon(exitIcon);
        CutItem = new JMenuItem("Cut");
        CutItem.setIcon(cutIcon);
        CopyItem = new JMenuItem("Copy");
        CopyItem.setIcon(copyIcon);
        PasteItem = new JMenuItem("Paste");
        PasteItem.setIcon(pasteIcon);
        SelectAll = new JMenuItem("Select All");
        
        file.add(newFile);
        file.addSeparator();
        file.add(openFile);
        file.addSeparator();
        file.add(exitItem);
        //file.addSeparator();
        edit.add(CutItem);
        edit.addSeparator();
        edit.add(CopyItem);
        edit.addSeparator();
        edit.add(PasteItem);
        //edit.addSeparator();
        help.add(SelectAll);
        
        newFile.addActionListener(this);
        exitItem.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newFile){
            JFrame frame = new JFrame();
            frame.setVisible(true);
            frame.setBounds(100,100,400,500);
            frame.setTitle("New Frame");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
        }
        else if(e.getSource() == exitItem){
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        JMenuDemo frame = new JMenuDemo();
        frame.setVisible(true);
    } 
}
