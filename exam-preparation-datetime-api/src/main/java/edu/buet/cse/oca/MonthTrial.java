package edu.buet.cse.oca;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthTrial {
  public static void main(String... args) {
    Month month = Month.APRIL;
    Locale locale = Locale.getDefault();
    
    System.out.println(month.getValue());
    System.out.println(month.getDisplayName(TextStyle.FULL, locale));
    System.out.println(month.getDisplayName(TextStyle.SHORT, locale));
    System.out.println(month.getDisplayName(TextStyle.NARROW, locale));
  }
}
