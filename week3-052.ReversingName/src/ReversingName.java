
import java.util.Scanner;

public class ReversingName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();

        sepratingCharacters(name);
    }

    public static void sepratingCharacters(String text) {

        int i = text.length() - 1;
        System.out.print("In reverse order: ");
        while (i >= 0) {

            System.out.print(text.charAt(i));

            i--;
        }
        System.out.println("");

    }
}
