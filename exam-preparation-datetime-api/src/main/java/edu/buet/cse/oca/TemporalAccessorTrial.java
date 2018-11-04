package edu.buet.cse.oca;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAccessor;

public class TemporalAccessorTrial {
  public static void main(String... args) {
    LocalDate d = LocalDate.parse("2018-01-01");
    LocalTime t = LocalTime.parse("13:05:17");
    LocalDateTime dt = LocalDateTime.of(d, t);

    System.out.println(d instanceof TemporalAccessor);
    System.out.println(t instanceof TemporalAccessor);
    System.out.println(dt instanceof TemporalAccessor);
  }
}
