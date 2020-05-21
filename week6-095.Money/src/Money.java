
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }
        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money added) {
        Money sumOfMoney = new Money(this.euros() + added.euros(), this.cents() + added.cents());
        return sumOfMoney;
    }

    public boolean less(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        } else if (this.euros() == compared.euros()) {
            if (this.cents() < compared.cents()) {
                return true;
            }
        }
        return false;
    }

    public Money minus(Money decremented) {
        Money balance;
        int differenceOMoney = (this.euros() * 100 + this.cents()) - (decremented.euros() * 100 + decremented.cents());
        if (differenceOMoney < 0) {
            balance = new Money(0, 0);
        } else {
            balance = new Money(0, differenceOMoney);
        }

        return balance;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
