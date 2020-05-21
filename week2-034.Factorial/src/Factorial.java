import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
int num;
int fact=1;
        System.out.println("Type a number:");
        num = Integer.parseInt(reader.nextLine());
        int i =1;
        while (i<=num)
        {
            fact = fact*i;
            i++;
        }
        System.out.println("Factorial is "+fact);
    }
}
