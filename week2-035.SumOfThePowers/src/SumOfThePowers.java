
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int pow = Integer.parseInt(reader.nextLine());
        int b=0;
        int result=0;
        while(b<=pow)
        {
            
           result+= (int)Math.pow(2, b);
            b++;
        }
        System.out.println("Result is "+result);
    }
}
