/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrtuction;

import newpackage.*;




/**
 *
 * @author Daffodi PC
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        parent p = new parent(); 
        System.out.println("Attribute "+p.b) ;
        p.show();
        child c = new child();
        c.show();
        additional a = new additional();
//        X x = new X(); 
//        Y y = new Y(); 
//        Z z = new Z();
        //System.out.println("test abstruction"); 

    }
    
}
