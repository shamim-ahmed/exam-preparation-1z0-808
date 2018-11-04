package edu.buet.cse.oca;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatTrial {
  public static void main(String... args) {
    LocalDateTime dt = LocalDateTime.parse("2018-10-10T12:09:55");

    System.out.println(dt.toString());
    System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
  }
}
