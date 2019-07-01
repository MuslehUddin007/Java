
package FileHandling;
import java.util.Formatter;
import java.io.IOException;
import java.util.Scanner;


public class FileWrite {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String id,name;
        
       try{
           Formatter formatter = new Formatter("E:/Java Project/excercise/src/FileHandling/file.txt");
           System.out.print("Enter how many Information you want to store = ");
           int n = scn.nextInt();
           for(int i=0;i<n;i++){
               id = scn.nextLine();
               name = scn.nextLine();
               System.out.println("");
               formatter.format("%s %s\r\n",id,name);
           }
           formatter.close();
           
       }catch(IOException e){
           System.out.println(e);
       }    
    }
    
}
