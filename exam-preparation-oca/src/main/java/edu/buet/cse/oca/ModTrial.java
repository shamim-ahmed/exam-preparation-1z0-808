package edu.buet.cse.oca;

public class ModTrial {
  public static void main(String...args) {
    // mod with long values
    long a = 15L;
    long b = 4L;
    long c = a % b;
    
    System.out.println(c);
    
    // mod with float values
    float x = 1.23f;
    float y = 0.01f;
    float z = x % y;
    
    System.out.println(z);
  }
}
