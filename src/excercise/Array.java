
package excercise;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        
        int[] number = new int[10];
        
        for(int i = 0;i<number.length;i++){
            number[i] = print.nextInt();
        }
        Arrays.sort(number);
        
        for(int x : number){
            System.out.println(" "+x);
        }
        
    }
    
}
