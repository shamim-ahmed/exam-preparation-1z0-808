package edu.buet.cse.oca;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class InstantTrial {
  public static void main(String... args) {
    Instant instant = Instant.now().plusSeconds(3600L);
    System.out.println(DateTimeFormatter.ISO_INSTANT.format(instant));
  }
}
