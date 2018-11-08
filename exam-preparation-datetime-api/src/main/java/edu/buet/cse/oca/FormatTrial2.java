package edu.buet.cse.oca;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FormatTrial2 {
  public static void main(String... args) {
    LocalDateTime dt = LocalDateTime.of(2016, Month.JANUARY, 1, 3, 4);
    
    System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
    System.out.println(dt.format(DateTimeFormatter.ISO_TIME));
    System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
   
    System.out.println(DateTimeFormatter.ISO_DATE.format(dt));
    System.out.println(DateTimeFormatter.ISO_TIME.format(dt));
    System.out.println(DateTimeFormatter.ISO_DATE_TIME.format(dt));
  }
}
