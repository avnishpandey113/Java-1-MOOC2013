
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First?");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("second?");
        int second = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int i=first;
        while(i>= first && i<=second)
        {
            sum= sum+i;
            i++;
        }
        System.out.println("Sum is "+sum);
    }
}
