
package Inheritance;


public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try{
            int[] arr = new int[2];
            arr[2] = 20;
        }catch(ArithmeticException ex){
            System.out.println("Exception: "+ex);
        }catch(Exception ex1){
            System.out.println("Exception: "+ex1);
        }finally{
            System.out.println("That is wrong Answer!!");
        }
        
        
    }
    
}
