/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrtuction;

/**
 *
 * @author Daffodi PC
 */
public class parent {
    //abstract 
        private int a;
        protected int b;
         int c;
        public int d;
        
        //this.a=10;
        
        private int getA(){
            return a;
        }
         void show(){
            this.b=10;
            c=20;
            d=30;
            System.out.println("A="+getA());
            System.out.println("b="+b);
            System.out.println("c="+c);
            System.out.println("d="+this.d);
        }
        
       public parent(){} 
}
