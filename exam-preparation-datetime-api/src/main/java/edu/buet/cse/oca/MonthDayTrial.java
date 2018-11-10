package edu.buet.cse.oca;

import java.time.Month;
import java.time.MonthDay;

public class MonthDayTrial {
  public static void main(String... args) {
    MonthDay date = MonthDay.of(Month.FEBRUARY, 29);
    System.out.println(date.isValidYear(2010));

    MonthDay date2 = date.withDayOfMonth(27);
    System.out.println(date2.isValidYear(2010));
  }
}
