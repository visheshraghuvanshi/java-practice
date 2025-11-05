import java.time.*;

public class DateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt);

        OffsetTime ot = OffsetTime.now();
        System.out.println(ot);

        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt2);

        MonthDay md = MonthDay.now();
        System.out.println(md);

        YearMonth ym = YearMonth.now();
        System.out.println(ym);

        Year y = Year.now();
        System.out.println(y);

        Period p = Period.between(LocalDate.now(), LocalDate.of(2028, Month.JULY, 6));
        System.out.println(p);

        Period p2 = Period.of(2,2,10);
        System.out.println(p2.addTo(LocalDate.now()));

        Instant i = Instant.now();
        System.out.println(i);

        Duration d = Duration.ofHours(5);
        System.out.println(d);

    }
}
