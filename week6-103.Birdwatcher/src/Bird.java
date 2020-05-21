
public class Bird {

    private String name;
    private String latinName;
    private int count;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.count = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void observations() {
        this.count++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.count + " observations";
    }

}
