
public class BoundedCounter {

    private int value;
    private final int upperLimit;

    public BoundedCounter(int upperLimit,int value) {
        // write code here
        this.value =value;
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    @Override
    public String toString() {
        // write code here
        if (this.value < 10) {
            return "0" + this.value;
        }
        else
        {
            return "" + this.value;
        }
        
    }

    public int getValue() {

        return this.value;
    }

    public void setValue(int value) {

        if (value >= 0 && value <= this.upperLimit) {
            this.value = value;
        }
    }

}
