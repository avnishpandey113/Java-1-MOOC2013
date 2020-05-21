
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private static final double PRICE_OF_GOURMET=4.00,PRICE_OF_ECONOMICAL=2.50;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= PRICE_OF_ECONOMICAL) {
            this.cashInRegister += PRICE_OF_ECONOMICAL;
            this.economicalSold++;
            return cashGiven - PRICE_OF_ECONOMICAL;
        } else {
            return cashGiven;
        }

    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= PRICE_OF_GOURMET) {
            this.cashInRegister += PRICE_OF_GOURMET;
            this.gourmetSold++;
            return cashGiven - PRICE_OF_GOURMET;
        } else {
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= PRICE_OF_ECONOMICAL) {
            this.economicalSold++;
            card.loadMoney(-PRICE_OF_ECONOMICAL);
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= PRICE_OF_GOURMET) {
            this.gourmetSold++;
            card.loadMoney(-PRICE_OF_GOURMET);
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum >= 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }

    }

    @Override
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
