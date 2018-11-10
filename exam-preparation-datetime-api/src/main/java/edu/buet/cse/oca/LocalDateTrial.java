package edu.buet.cse.oca;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTrial {
  public static void main(String...args) {
    LocalDate date = LocalDate.of(2016, Month.JANUARY, 31);
    LocalDate date2 = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
    
    System.out.println(date.format(DateTimeFormatter.ISO_DATE));
    System.out.println(date2.format(DateTimeFormatter.ISO_DATE));
    
    DayOfWeek dow = date.getDayOfWeek();
    System.out.println(dow);
  }
}
