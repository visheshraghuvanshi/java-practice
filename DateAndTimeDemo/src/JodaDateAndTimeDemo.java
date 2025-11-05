import java.time.*;

public class JodaDateAndTimeDemo {
    public static void main(String[] args) {
        // Time since 1 Jan 1970
        // Stored in seconds + nanoseconds
        // Immutable

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDate d2 = LocalDate.now(Clock.systemDefaultZone());
        System.out.println(d2);

        LocalDate d3 = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(d3);

        LocalDate d4 = LocalDate.of(2020, Month.NOVEMBER, 10);
        System.out.println(d4);

        LocalDate d5 = LocalDate.ofEpochDay(1); // increase 1 day from 1/1/1970
        System.out.println(d5);

        LocalDate d6 = LocalDate.parse("2021-10-04"); // YYYY-MM-DD
        System.out.println(d6);

        System.out.println(d6.plusDays(10000));

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalTime t2 = t.minusHours(3);
        System.out.println(t2);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
