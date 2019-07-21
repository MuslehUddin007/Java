package excercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(50);
        number.add(-20);
        number.add(10);
        number.add(3,40);
        
        //Normal Output//
        System.out.println("Normal Output : ");
        System.out.println(number);
        System.out.println("Size : "+number.size());
        
        //for each Output//
        System.out.println("For each Output : ");
        for(int x : number){
            System.out.println(x);
        }
        
        //iterator Output//
        System.out.println("Iterator Output : ");
        Iterator itr = number.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        boolean b = number.isEmpty();
        System.out.println("Is ArrayList Empty : "+b);
        
        Collections.sort(number);
        System.out.println("Sort in ascending order : "+number);
        
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("Sort in descending order : "+number);
    }
}
