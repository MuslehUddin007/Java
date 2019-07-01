
package excercise;

//we can use the enum inside the class or outside of the class//

enum colors{
    RED,GREEN,BLUE;
}

public class enumDemo {
    public static void main(String[] args) {
        
        //values return value from enum//
        //ordinal return index number of enum value//
     
        colors arr[] = colors.values();
        
        for(colors col: arr){
            System.out.println(col+" index of "+col.ordinal());
        }
        
        //another way//
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" index of "+arr[i].ordinal());
        }
        
        //valueOf return if there exist the value//
        System.out.println(colors.valueOf("GREEN"));
    }
}
