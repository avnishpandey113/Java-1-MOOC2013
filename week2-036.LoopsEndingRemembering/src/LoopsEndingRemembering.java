
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        int num = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int even = 0, odd = 0;
        while (num != -1) {

            sum = sum + num;
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + (even + odd));
        System.out.println("Average: " + ((float)sum / (even + odd)));
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);

    }
}
