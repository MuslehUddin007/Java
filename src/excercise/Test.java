package excercise;


public class Test {
    public static void main(String[] args) {
        StaticMethod ob = new StaticMethod();
        //StaticMethod.StaticMethod();  //False//
        ob.StaticMethod();  //True//
        //ob.method();   //True//
        StaticMethod.method();  //True//
    }
    
}
