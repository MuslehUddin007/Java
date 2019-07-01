
package Inheritance;


public class Teacher extends Person{
    
    String qualification,id;
    int x = 20;
    
    @Override 
    void displayinformation(){
        super.displayinformation();
        System.out.println("This is from OverRide Method");
    }
    
    
    void displayinformation1(){
        System.out.println("This is from Teacher");
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Qualification: "+qualification);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
        System.out.println("Private Member Name: "+getName1());
    }
    
    void Super_display(){
        System.out.println("X from Teacher Class = "+x);
        System.out.println("X from Person Class = "+super.x);
    }
}
