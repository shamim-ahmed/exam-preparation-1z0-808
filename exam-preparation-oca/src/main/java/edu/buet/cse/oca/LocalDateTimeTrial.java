package edu.buet.cse.oca;

import java.time.LocalDateTime;

public class LocalDateTimeTrial {
  public static void main(String... args) {
    LocalDateTime dateTime1 = LocalDateTime.of(2018, 10, 27, 6, 24);
    System.out.println(dateTime1);

    LocalDateTime dateTime2 = LocalDateTime.of(2018, 10, 27, 6, 24, 36);
    System.out.println(dateTime2);
  }
}
