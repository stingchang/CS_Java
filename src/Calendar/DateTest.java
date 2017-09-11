package Calendar;

public class DateTest {

    static String[] monthString = {"Jan", "Feb", "Mar", "Apr", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    private int day;
    private int month;
    private int year;
    static int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public DateTest() {
        this(1, 1, 2017);
    }

    public DateTest(int day, int month, int year) {
        this.year = year < 0 ? 2017 : year;
        this.month = month < 0 ? 1 : month > 12 ? month % 12 : month;
        this.day = day < 0 ? 1 : day > getDays() ? day % getDays() : day;
    }

    private int checkLeapMonth(){
        if(this.year%4 == 0 && this.month == 2) return 29;
        return dayOfMonth[1];
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public boolean isLeapYear(){
        return this.year%4 == 0;
    }
    public boolean isLeapMonth(){
        return isLeapYear() && this.month == 2;
    }

    private int getDays(){
        return isLeapMonth()? 29 : dayOfMonth[this.month - 1];
    }
    public DateTest addDay(int day) {
        int m = this.month;
        int d = day + this.day;
        int y = this.year;

        while (d > getDays()) {
            d -= getDays();
            m++;
            if (m > 12) {
                m = 1;
                y++;
            }
        }

        return new DateTest(d, m, y);
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return toTwoDigits(this.day) + "/" + toTwoDigits(this.month) + "/" + this.year;
    }

    private String toTwoDigits(int n) {
        if (n < 10) return "0" + n;
        return "" + n;
    }

    private String toFourDigits(int n) {
        StringBuilder sb = new StringBuilder();
        while ((sb.toString() + n).length() < 4) {
            sb.append("0");
        }
        return sb.toString() + n;
    }

    public static void main(String[] args) {
        DateTest d = new DateTest(27,2,2000);
        d.print();
        System.out.print(d + " +2 : ");
        DateTest d2 = d.addDay(2);
        d2.print();

        System.out.print(d2 + " +3 : ");
        d2 = d.addDay(3);
        d2.print();
    }


}


// leap year y%4 == 0 => feb has 29 days
