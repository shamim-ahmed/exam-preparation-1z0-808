package edu.buet.cse.oca;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZonedDateTimeTrial {
  public static void main(String... args) {
    List<String> zoneList = new ArrayList<>(ZoneId.getAvailableZoneIds());
    Collections.sort(zoneList);
    LocalDateTime dateTime = LocalDateTime.now();

    for (String zone : zoneList) {
      ZoneId zoneId = ZoneId.of(zone);
      ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
      System.out.println(zonedDateTime);
    }
  }
}
