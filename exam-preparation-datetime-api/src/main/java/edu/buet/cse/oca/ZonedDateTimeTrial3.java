package edu.buet.cse.oca;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeTrial3 {
  public static void main(String... args) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
    LocalDateTime dateTime = LocalDateTime.of(LocalDate.now(), LocalTime.of(16, 5, 30));
    ZonedDateTime sydneyTime = ZonedDateTime.of(dateTime, sydneyZone);
    System.out.println(sydneyTime.format(formatter));

    ZoneId dhakaZone = ZoneId.of("Asia/Dhaka");
    ZonedDateTime dhakaTime = sydneyTime.withZoneSameInstant(dhakaZone);
    System.out.println(dhakaTime.format(formatter));
  }
}
