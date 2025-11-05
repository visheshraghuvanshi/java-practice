import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class OldCalendarAndTimeZoneDemo {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();

        System.out.println(gc.isLeapYear(2024));
        System.out.println(gc.get(Calendar.MONTH)); // 0 = jan, 11 = dec
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));

        TimeZone tz = gc.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());
        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println(gc.getTimeZone());
    }
}
