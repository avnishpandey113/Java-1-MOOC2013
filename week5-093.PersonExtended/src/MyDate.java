
public class MyDate {

    private int day;
    private int month;
    private int year;
    private final int DAYS_IN_YEAR, DAYS_IN_MONTH;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
        this.DAYS_IN_YEAR = 365;
        this.DAYS_IN_MONTH = 30;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        int days, differenceInYears;
        days = (this.year * DAYS_IN_YEAR + this.month * DAYS_IN_MONTH + this.day) - (comparedDate.year * DAYS_IN_YEAR + comparedDate.month * DAYS_IN_MONTH + comparedDate.day);
        differenceInYears = days / DAYS_IN_YEAR;
        if (differenceInYears < 0) {
            differenceInYears = differenceInYears * (-1);
        }
        return differenceInYears;

    }

}
