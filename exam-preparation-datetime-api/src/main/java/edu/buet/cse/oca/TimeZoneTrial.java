package edu.buet.cse.oca;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneTrial {
  public static void main(String... args) {
    LocalDateTime dt = LocalDateTime.parse("2016-05-05T12:00:05");
    ZonedDateTime zdt = ZonedDateTime.of(dt, ZoneId.of("GMT"));
    
    System.out.println(zdt.format(DateTimeFormatter.ISO_DATE_TIME));
  }
}
