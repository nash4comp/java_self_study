package Chap10.examples;

import static java.time.DayOfWeek.TUESDAY;
import static java.time.temporal.TemporalAdjusters.firstDayOfNextMonth;
import static java.time.temporal.TemporalAdjusters.firstInMonth;
import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class DayAfterTomorrow implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(2, ChronoUnit.HALF_DAYS);
    }
}

public class NewTimeEx3 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = today.with(new DayAfterTomorrow());

        p(today);
        p(date);
        p(today.with(firstDayOfNextMonth()));
        p(today.with(lastDayOfMonth()));
        p(today.with(lastDayOfMonth()));
        p(today.with(firstInMonth(TUESDAY)));

    } // end of main

    static void p(Object obj) {
        System.out.println(obj);
    } // end of method p

} // end of class
