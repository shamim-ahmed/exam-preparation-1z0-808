package edu.buet.cse.oca;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class LocalTimeTrial {
  public static void main(String... args) {
    LocalTime time = LocalTime.of(23, 59, 59);
    System.out.println(time.format(DateTimeFormatter.ISO_TIME));

    LocalTime time2 = time.plusHours(1).plusMinutes(5).plusSeconds(2);
    System.out.println(time2.format(DateTimeFormatter.ISO_TIME));

    try {
      LocalTime time3 = time.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
      System.out.println(time3.format(DateTimeFormatter.ISO_TIME));
    } catch (Exception ex) {
      System.err.println(ex);
    }
  }
}
