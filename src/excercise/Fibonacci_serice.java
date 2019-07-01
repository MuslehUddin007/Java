
package excercise;
import java.util.Scanner;

public class Fibonacci_serice {
    // user define method//
    public static int fibonacci(int n){
        if(n<=1) return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    //main method//
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any number = ");
        int fibo = scn.nextInt();
        fibo = fibonacci(fibo);
        System.out.println("Fibonacci Serice = "+fibo);
        
    }
    
}
