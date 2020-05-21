
import java.util.ArrayList;

public class BirdWatcher {

    private ArrayList<Bird> birdWatchDatabase;

    public BirdWatcher() {
        this.birdWatchDatabase = new ArrayList<Bird>();
    }

    public void add(String name, String latinName) {
        Bird bird = new Bird(name, latinName);
        birdWatchDatabase.add(bird);
    }

    public void observation(String name) {
        for (Bird bird : birdWatchDatabase) {
            if (bird.getName().equalsIgnoreCase(name) || bird.getLatinName().equalsIgnoreCase(name)) {
                bird.observations();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }

    public void statistics() {
        for (Bird bird : birdWatchDatabase) {
            System.out.println(bird.toString());
        }
    }

    public void show(String name) {
        for (Bird bird : birdWatchDatabase) {
            if (bird.getName().equalsIgnoreCase(name) || bird.getLatinName().equalsIgnoreCase(name)) {
                System.out.println(bird.toString()); 
            }
        }
    }
}
