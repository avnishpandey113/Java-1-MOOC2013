
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    private int length;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        String password = "";
        int i = 0;
        while (i < length) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            password += symbol;
            i++;
        }
        return password;
    }
}
