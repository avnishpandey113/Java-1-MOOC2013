
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type exam scores, -1 completes:");
        ArrayList<Integer> examScores = new ArrayList<Integer>();
        String[] scoresInGrade = {"", "", "", "", "", ""};
        while (true) {
            int score = Integer.parseInt(reader.nextLine());
            if (score == -1) {
                break;
            } else if (score > 60 || score < -1) {
                System.out.println("Invalid input");
            } else {
                examScores.add(score);
            }
        }
        for (int score : examScores) {
            if (score <= 29) {
                scoresInGrade[0] += "*";
            } else if (score <= 34) {
                scoresInGrade[1] += "*";
            } else if (score <= 39) {
                scoresInGrade[2] += "*";
            } else if (score <= 44) {
                scoresInGrade[3] += "*";
            } else if (score <= 49) {
                scoresInGrade[4] += "*";
            } else if (score <= 60) {
                scoresInGrade[5] += "*";
            }
        }
        System.out.println("Grade distribution:");
        System.out.println("5: " + scoresInGrade[5]);
        System.out.println("4: " + scoresInGrade[4]);
        System.out.println("3: " + scoresInGrade[3]);
        System.out.println("2: " + scoresInGrade[2]);
        System.out.println("1: " + scoresInGrade[1]);
        System.out.println("0: " + scoresInGrade[0]);

        double acceptancePercentage = (100 * (scoresInGrade[5].length() + scoresInGrade[4].length() + scoresInGrade[3].length() + scoresInGrade[2].length() + scoresInGrade[1].length())) / (double) (scoresInGrade[5].length() + scoresInGrade[4].length() + scoresInGrade[3].length() + scoresInGrade[2].length() + scoresInGrade[1].length() + scoresInGrade[0].length());
        System.out.println("Acceptance percentage: " + acceptancePercentage);
    }
}
