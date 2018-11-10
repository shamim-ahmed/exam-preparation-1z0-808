package edu.buet.cse.oca;

import java.time.Year;

public class YearTrial {
  public static void main(String... args) {
    Year year = Year.of(2012);
    System.out.println(year.isLeap());

    Year year2 = year.plusYears(6);
    System.out.println(year2.isLeap());
  }
}
