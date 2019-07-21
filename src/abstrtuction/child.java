/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrtuction;

/**
 *
 * @author Daffodi PC
 */
public class child extends parent{
    //@Override
    private int b;
        
    public child(){
        super.b = 20;
        this.b = 10;
    }
    public void show (){
        //this.
        
        System.out.println("a="+super.b);
    }    
}
