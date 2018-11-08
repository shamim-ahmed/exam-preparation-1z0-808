package edu.buet.cse.oca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class DateArithmetic {
  public static void main(String...args) {
    LocalDate today = LocalDate.now();
    LocalDate otherDay = today.with(TemporalAdjusters.lastDayOfMonth()).minusDays(2);
    
    System.out.println(otherDay.format(DateTimeFormatter.ISO_DATE));
  }
}
