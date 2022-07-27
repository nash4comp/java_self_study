package Chap10.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NewTimeEx2 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dt = LocalDateTime.of(date, time);

        ZoneId zid = ZoneId.systemDefault();
        ZonedDateTime zdt = dt.atZone(zid);

        ZoneId seoulId = ZoneId.of("Asia/Seoul");
        ZonedDateTime seoulTime = ZonedDateTime.now()
                .withZoneSameInstant(seoulId);
        ZoneId nyId = ZoneId.of("America/New_York");
        ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);

        OffsetDateTime odt = zdt.toOffsetDateTime();

        System.out.println("current:\t" + dt);
        System.out.println("zid:\t\t" + zid);
        System.out.println("zdt:\t\t" + zdt);
        System.out.println("seoulTime:\t" + seoulTime);
        System.out.println("nyTime:\t\t" + nyTime);
        System.out.println("odt:\t" + odt);

    }

}
