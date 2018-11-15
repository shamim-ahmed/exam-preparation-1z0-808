package edu.buet.cse.oca.q77;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTrial {
  public static void main(String... args) {
    LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);
    ZonedDateTime zd = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
    
    ZonedDateTime result1 = zd.plus(Period.ofDays(1));
    System.out.println(result1);
    
    ZonedDateTime result2 = zd.plus(Duration.ofDays(1));
    System.out.println(result2);
  }
}
