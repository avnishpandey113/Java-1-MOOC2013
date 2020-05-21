
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BirdWatcher birdWatcher = new BirdWatcher();
        String command = "";
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.print("? ");
            command = reader.nextLine();
            if (command.equalsIgnoreCase("Quit")) {
                break;
            } else if (command.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
                birdWatcher.add(name, latinName);
            } else if (command.equalsIgnoreCase("Observation")) {
                System.out.print("What was observed:? ");
                String name = reader.nextLine();
                birdWatcher.observation(name);
            } else if (command.equalsIgnoreCase("Statistics")) {
                birdWatcher.statistics();
            }
            else if (command.equalsIgnoreCase("Show")) {
                System.out.print("What? ");
                String name=reader.nextLine();
                birdWatcher.show(name);
            }

        }

    }

}
