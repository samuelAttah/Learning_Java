import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class PlayDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        DateFormat df;
        df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Japan: " + df.format(date));
        df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
        System.out.println("Korea: " + df.format(date));
        df = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
        System.out.println("United Kingdom: " + df.format(date));
        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println("United States: " + df.format(date));
        df = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.FRANCE);
        System.out.println("France: " + df.format(date));
    }

}
