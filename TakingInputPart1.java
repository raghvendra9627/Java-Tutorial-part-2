import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakingInputPart1 {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        System.out.println("enter a number");
        int a = Integer.parseInt(bf.readLine());

        System.out.println(a);

        bf.close();
    }
}
