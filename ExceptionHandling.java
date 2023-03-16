public class ExceptionHandling {
    public static void main(String[] args) {
        int i = 0;
        int j = 9;
        
        try{
            System.out.println(j/i);
        }
        catch(Exception e){
            System.out.println("something went wrong "+e);
        }

        System.out.println("bye");
        System.out.println("value of "+i+" value "+j);
    }
}
