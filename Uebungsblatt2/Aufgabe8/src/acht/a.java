package acht;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class a {

    public void lDate() {
        LocalDate given = LocalDate.of(2024, 1, 1);
        LocalDate ldate = LocalDate.now();
        LocalDate date1 = ldate.plusMonths(2);
        LocalDate date2 = date1.minusMonths(2).minusDays(10);
        System.out.println(ldate);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println("Tage zwischen 01.01.2024 und " + date2 + " = " + ChronoUnit.DAYS.between(date2, given));
    }

}
