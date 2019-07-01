
package excercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;

public class UseOfArrayList{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList();
        
        number.add(10);
        number.add(92);
        number.add(2,50);
        number.remove(1);
        boolean x = number.contains(50);
        int y = number.indexOf(50);
        boolean m = number.isEmpty();
        number.add(-15);
        number.add(96);
        number.add(12);
        //easy print//
        //System.out.println("Size "+number.size());
        
        //for each loop//
        /*for(int x : number){
            System.out.println(" "+x);
        }*/
        //for each loop//
        /*number.forEach((x) ->{
        System.out.println(" "+x);
    });*/
        //iterator use //
        System.out.println("Array :");
        Iterator itr = number.iterator();
        while(itr.hasNext()){
            System.out.println(" "+itr.next());
        }
        System.out.println("Size = "+number.size());
        System.out.println("Contain = "+x);
        System.out.println("Index of "+y);
        System.out.println("Is Empty = "+m);
        System.out.println("Set = "+number.set(0,-1));
        System.out.println("Get = "+number.get(0));
        
        Collections.sort(number);
        System.out.println("Ascending Order: "+number);
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("Dscending Order: "+ number);
    }
    
}