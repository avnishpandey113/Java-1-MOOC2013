
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {

        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while (amount > 0) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int counter = 1;
        while (size > 0) {
            printWhitespaces(size - 1);
            printStars(counter);
            counter++;
            size--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int stand = height;
        int counter = 1;
        while (height > 0) {
            printWhitespaces(height - 1);
            printStars(counter);
            counter += 2;
            height--;
        }
        int i=2;
        while(i>0)
        {
            printWhitespaces(stand-2);
            printStars(3);
            i--;
        }

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
