
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 

        while (true) {
            System.out.println("Enter the tempreature:");
            double tempreature = Double.parseDouble(reader.nextLine());
            if (tempreature >= -30 && tempreature <= 40) {
                Graph.addNumber(tempreature);
            }
            

        }
    }
}
