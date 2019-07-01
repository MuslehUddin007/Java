
package excercise;

public class Vari_len_arg {
    
    void add(int ... num){
        int sum = 0;
        for(int x : num){
            sum += x;
        }
        System.out.println("Sum = "+sum);
        
    }
    
}
