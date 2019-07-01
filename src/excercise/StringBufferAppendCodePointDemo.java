
package excercise;


public class StringBufferAppendCodePointDemo {
    public static void main(String[] args) {
        StringBuffer stb = new StringBuffer("Md Musleh Uddin");
        
        System.out.println("String Buffer: "+stb);
        
        stb.appendCodePoint(65);
        System.out.println("Strng Buffer After Append CodePoint is: "+stb);
    }
    
}
