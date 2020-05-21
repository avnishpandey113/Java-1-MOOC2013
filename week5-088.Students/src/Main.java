
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        String studentName;
        String studentNumber;
        String term;
        while (true) {
            System.out.println("Name:");
            studentName = reader.nextLine();
            if (studentName.trim().isEmpty()) {
                break;
            }
            System.out.println("studentnumber:");
            studentNumber = reader.nextLine();
            list.add(new Student(studentName, studentNumber));
        }
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("Give search term:");
        term = reader.nextLine();
        System.out.println("Result:");
        for (Student student : list) {

            if (student.getName().contains(term)) {
                System.out.println(student);
            }

        }

    }
}
