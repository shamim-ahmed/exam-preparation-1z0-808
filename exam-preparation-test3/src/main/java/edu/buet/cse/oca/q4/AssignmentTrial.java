package edu.buet.cse.oca.q4;

public class AssignmentTrial {
  public static void main(String... args) {
    byte b1 = 1;
    byte b2 = 2;
    byte b3 = (byte) (b1 + b2); // it won't compile without the cast

    System.out.println(b3);
  }
}
