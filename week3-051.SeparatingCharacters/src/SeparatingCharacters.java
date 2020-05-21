
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();

        sepratingCharacters(name);
    }

    public static void sepratingCharacters(String text) {

            int i = 0;
            while (i < text.length()) {
                System.out.println(i+1 + " .character:" + text.charAt(i));
                i++;
            }

    }
}
