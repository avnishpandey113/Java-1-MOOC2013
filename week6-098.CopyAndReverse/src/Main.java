
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reverse = reverseCopy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int[] copied = new int[array.length];
        System.arraycopy(array, 0, copied, 0, copied.length);
        return copied;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reverse = new int[array.length];
        int j = array.length - 1;
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = array[j];
            j--;
        }
        return reverse;
    }

}
