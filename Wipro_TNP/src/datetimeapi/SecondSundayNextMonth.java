package datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SecondSundayNextMonth {

    public static void main(String[] args) {

        LocalDate firstDayNextMonth =
                LocalDate.now()
                         .plusMonths(1)
                         .withDayOfMonth(1);

        int sundayCount = 0;
        LocalDate date = firstDayNextMonth;

        while (true) {

            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sundayCount++;

                if (sundayCount == 2) {
                    System.out.println("Second Sunday of Next Month: " + date);
                    break;
                }
            }

            date = date.plusDays(1);
        }
    }
}