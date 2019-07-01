
package excercise;

import java.util.Arrays;


public class sortBinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,15,60,45,33};
        Arrays.sort(arr);
        
        int key = 15;
        
        int bs = Arrays.binarySearch(arr, key);
        
        if(bs>=0)
            System.out.println("found");
        else
            System.out.println("Not found");
    
    }
    
}
