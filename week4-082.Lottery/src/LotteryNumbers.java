
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random randomizer;

    public LotteryNumbers() {
        this.randomizer = new Random();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
                // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int counter = 0;
        while (counter < 7) {
            int drawNum = randomizer.nextInt(39) + 1;
            if (!containsNumber(drawNum)) {
                counter++;
                numbers.add(drawNum);
            }
        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers
        if (numbers.contains(number)) {
            return true;
        } else {
            return false;
        }

    }
}
