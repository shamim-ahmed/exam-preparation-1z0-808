package edu.buet.cse.oca;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeTrial {
  public static void main(String... args) {
    LocalDateTime dateTime = LocalDateTime.of(2016, 01, 31, 12, 25);
    System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
    System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE));
    System.out.println(dateTime.format(DateTimeFormatter.ISO_TIME));
    System.out.println();
    
    LocalDateTime dateTime2 = dateTime.with(TemporalAdjusters.firstDayOfNextMonth());
    System.out.println(dateTime2.format(DateTimeFormatter.ISO_DATE_TIME));
    LocalDateTime dateTime3 = dateTime.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
    System.out.println(dateTime3);
    System.out.println();
    
    LocalDateTime dateTime4 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
    System.out.println(dateTime4);
  }
}
