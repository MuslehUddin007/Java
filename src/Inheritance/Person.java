
package Inheritance;

public class Person {
    
    String name,gender,phone;
    private String name1;
    int x = 10;
    
    void displayinformation(){
        System.out.println("This is from Person Method");
    }
    
    public void setName1(String name1){
        this.name1 = name1;
    }
    public String getName1(){
        return name1;
    }
    
}
