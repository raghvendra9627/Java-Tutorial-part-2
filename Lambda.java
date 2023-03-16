@FunctionalInterface  //It means only one method is there in this interface..
interface A{
    public void show();
}

interface B{
    public void show(int i);
}


public class Lambda {
    public static void main(String[] args) {
        //arrow shows that it is a lambda expression (it is only use with @functionalInterface. )
        A obj = () -> System.out.println("in show"); 
        obj.show();

        //here lambda expression is used to define the method that takes a variable as an argument..
        B obj2 = (i)-> System.out.println("in show B "+i);
        obj2.show(20);
    }
}
