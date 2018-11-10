package edu.buet.cse.oca.q11;

public class StringFromChar {
  public static void main(String... args) {
    char[] myCharArray = {'m', 'a', 'n', 'g', 'o'};
    
    String result = null;
    
    for (char c : myCharArray) {
      result += c;
    }
    
    System.out.println(result);
  }
}
