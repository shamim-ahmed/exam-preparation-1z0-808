package edu.buet.cse.oca.q49;

public class SubStringTrial {
  public static void main(String... args) {
    String text = "MINIMUM";
    
    System.out.println(text.substring(4));
    System.out.println(text.substring(4, 7));
    System.out.println(text.substring(text.indexOf('I'), 3));
    System.out.println();
    
    System.out.println(text.indexOf("INI"));
    System.out.println(text.indexOf("INI", 3));
    System.out.println(text.indexOf('I', 4));    
  }
}
