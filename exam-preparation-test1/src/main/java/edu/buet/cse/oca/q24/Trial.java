package edu.buet.cse.oca.q24;

public class Trial {
  public static void main(String... args) {
    String str1 = "one";
    String str2 = "two";
    
    System.out.println(str1.equals(str1 = str2));
    System.out.println(str1.equals(str2));
  }
}
