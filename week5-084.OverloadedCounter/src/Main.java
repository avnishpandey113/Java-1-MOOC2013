public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter c = new Counter(900, false); 
        c.decrease(7); 
        System.out.println(c.value());
    }
}
