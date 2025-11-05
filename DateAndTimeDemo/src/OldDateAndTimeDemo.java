import java.util.Date;

public class OldDateAndTimeDemo {
    public static void main(String[] args) {
        System.out.println("ms: " + System.currentTimeMillis());
        System.out.println(Long.MAX_VALUE);
        System.out.println("s: " + System.currentTimeMillis() / 1000);
        System.out.println("min: " + System.currentTimeMillis() / 1000 / 60);
        System.out.println("hours: " + System.currentTimeMillis() / 1000 / 60 / 60);
        System.out.println("days: " + System.currentTimeMillis() / 1000 / 60 / 60 / 24);
        System.out.println("years: " + System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365);

        Date d = new Date();
        System.out.println("Current Date and Time" + d);

        Date d2 = new Date("1/1/2030");
        System.out.println("d2: " + d2);

        System.out.println(d.getTime()); // in ms
        System.out.println(d.getDate());
        System.out.println(d.getDay()); // 0 = sunday
        System.out.println(d.getMonth()); // 0 = Jan
        System.out.println(d.getYear() + 1900); // as it starts from 1900
    }
}
