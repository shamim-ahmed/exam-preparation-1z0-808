package edu.buet.cse.oca;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeTrial2 {
  public static void main(String... args) {
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    ZoneId zoneId = ZoneId.of("Asia/Dhaka");

    ZonedDateTime dateTime = ZonedDateTime.of(date, time, zoneId);
    System.out.println(dateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
  }
}
