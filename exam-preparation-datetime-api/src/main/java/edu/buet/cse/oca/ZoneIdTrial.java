package edu.buet.cse.oca;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdTrial {
  public static void main(String... args) {
    Set<String> zoneSet = ZoneId.getAvailableZoneIds();

    for (String zone : zoneSet) {
      if (zone.contains("Sydney") || zone.contains("Dhaka")) {
        System.out.println(zone);
      }
    }
  }
}
