
package Inheritance;


public class Test {
    public static void main(String[] args) {
        Teacher ob = new Teacher();
        
        ob.name = "Md Musleh Uddin Khan Akil";
        ob.id = "181-35-2313";
        ob.qualification = "Bsc is SWE";
        ob.gender = "Male";
        ob.phone = "01722927983";
        ob.setName1("Md Musahid Uddin Khan Jihad");  //private member accses//
        
        ob.displayinformation();
        ob.displayinformation1();
        ob.Super_display();
        
        //use of instanceof//
        
        Person p = new Person();
        
        System.out.println("p Person class obj: "+ (p instanceof Person));
        System.out.println("ob Person class obj: "+ (ob instanceof Person));
        System.out.println("p Teacher class obj: "+ (p instanceof Teacher));
        System.out.println("ob Teacher class obj: "+ (ob instanceof Teacher));
    }
    
}
