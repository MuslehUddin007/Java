
package Swing;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DialogBox {
    public static void main(String[] args) {
        Integer[] options = {2,3,5,7,9};
        
        ImageIcon icon = new ImageIcon(DialogBox.class.getResource("view.png"));
        JOptionPane.showInputDialog(null,"Message","Title",JOptionPane.INFORMATION_MESSAGE,null,options,options[2]);
    }
    
}
