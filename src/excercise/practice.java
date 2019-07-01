/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise;

/**
 *
 * @author Md.Musleh
 */
public class practice {
    public static void main(String[] args) {
        char s1 = '8';
	char s2 = '#';
		
	boolean b = Character.isDigit(s1);
	boolean bo = Character.isDigit(s2);
	System.out.println("s1 = "+b);
	System.out.println("s2 "+bo);
        
        if(Character.isLetter(s2) && Character.isDigit(s2))
            System.out.println("s2 = Letter");
        else
            System.out.println("s2 = Symbol");
    }
}
