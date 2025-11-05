import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(dt));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss:SSS");
        System.out.println(dtf2.format(dt));

        // For Zone use ZonedDateTime
        ZonedDateTime zdt = ZonedDateTime.now();
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss:SSS z Z");
        System.out.println(dtf3.format(zdt));

        System.out.println(dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(dt.get(ChronoField.AMPM_OF_DAY)); // 0 for AM 1 for PM
        System.out.println(dt.get(ChronoField.YEAR));
    }
}
