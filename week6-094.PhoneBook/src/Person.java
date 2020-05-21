public class Person {
    private String name;
    private String number;

    public Person(String name, String phoneNum) {
        this.name = name;
        this.number = phoneNum;
    }

    @Override
    public String toString() {
        return this.name+" number: "+this.number; 
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
    public void changeNumber(String newNumber)
    {
        this.number = newNumber;
    }
    
    
}
