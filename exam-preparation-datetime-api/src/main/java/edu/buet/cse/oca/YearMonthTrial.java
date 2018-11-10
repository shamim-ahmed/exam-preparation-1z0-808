package edu.buet.cse.oca;

import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class YearMonthTrial {
  public static void main(String... args) {
    YearMonth date = YearMonth.now();
    System.out.println(date.getMonth());
    System.out.println(date.getMonthValue());

    YearMonth date2 = YearMonth.of(2017, Month.AUGUST);
    System.out.println(date2.getYear());

    YearMonth date3 = date2.plusMonths(1).plusYears(3);

    try {
      System.out.println(date3.format(DateTimeFormatter.ISO_DATE));
    } catch (Exception ex) {
      System.err.println(ex);
    }
  }
}
