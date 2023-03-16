/*here in this code we have created our own exception
for  doing that we just need to create a class with that name of exception
and extend it to the parent class(i.e. Exception class)
and in the try block create the object of your exception.
 */

/*If you want  to print the msg  along with the exception
 * then you should create a constructor in your exception class 
 * and refer the msg to the constructor of the parent class
 */


class MyException extends Exception{
    public MyException(String str)
    {
        super(str);
    }
}


public class ThrowKeyword {
    public static void main(String[] args) {
        int i = 0;
        int j = 2;
        String s = null;
        int k = 0;
        try{
            int c = i/j;
            if(c==0 && k==0)
                //throw  keyword is you to throw the exception that you want.
                throw new MyException("something went wrong");
        }
        catch(MyException e)
        {
            System.out.println("it is an exception "+e);
        }
        try{
            k = s.length();
            
            //another example of throw keywword for built-in class.
            throw new NullPointerException();
        }
        catch(NullPointerException e){
            System.out.println("String is null "+e);
        }    
    }
}
