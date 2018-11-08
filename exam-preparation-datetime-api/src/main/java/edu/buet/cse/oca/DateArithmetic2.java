package edu.buet.cse.oca;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateArithmetic2 {
  public static void main(String... args) {
    LocalDate bornOn = LocalDate.of(1983, Month.DECEMBER, 7);
    LocalDate firstBirthDay = bornOn.plusYears(1);

    System.out.println(firstBirthDay.format(DateTimeFormatter.ISO_DATE));
  }
}
