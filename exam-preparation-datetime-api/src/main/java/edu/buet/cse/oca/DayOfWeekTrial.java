package edu.buet.cse.oca;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfWeekTrial {
  public static void main(String... args) {
    DayOfWeek dow = DayOfWeek.MONDAY;
    Locale locale = Locale.getDefault();
    
    System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
    System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));
    System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
  }
}
