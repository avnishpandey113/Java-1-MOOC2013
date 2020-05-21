
import java.util.ArrayList;

public class Variance {

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer num : list) {
            sum = sum + num;
        }
        System.out.println(sum);
        return sum;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double avg = (double) sum(list) / list.size();
        System.out.println(avg);
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
       double yBar= average(list);
        double variance =0.0;
        for (Integer n : list)
        {
            variance = variance + ((n-yBar)*(n-yBar))/(double)(list.size()-1);
        }
        return variance;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        //list.add(7);
        //list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
