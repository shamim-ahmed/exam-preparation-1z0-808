package edu.buet.cse.oca.q26;

public class FinallyTrial {
  public static void main(String... args) throws Exception {
    try {
      m1();
      System.out.println("A");
    } finally {
      System.out.println("B");
    }

    System.out.println("C");
  }

  private static void m1() throws Exception {
    throw new Exception();
  }
}
