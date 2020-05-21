
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        firstThreeCharacter(name);

    }

    public static void firstThreeCharacter(String text) {
        if (text.length() < 3) {
            System.out.println("");
        } else {
            int i = 0;
            while (i < 3) {
                System.out.println(i+1 + " .character:" + text.charAt(i));
                i++;
            }
        }
    }
}
