class A{
    //In this class the show method throws the exception as there is no class named demo
    //This means that the show method is not responsibe for handling it.
    public void show() throws ClassNotFoundException{
        Class.forName("demo");
    }
}

public class ThrowsKeyword {

    //here the main method is calling the show function therefore it is responsible for handling exception.
    //we can do it by writing a try catch block or by again writing "throws exception" for the JVM to handle it.
    
  //FIRST METHOD : 
   /* public static void main(String[] args) throws ClassNotFoundException {
        A obj = new A();
        obj.show();
    }
    */

    //SECOND MEHOD:
    public static void main(String[] args) {
        A obj = new A();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            System.out.println("Class doesn't exist");
        }
    }
}
