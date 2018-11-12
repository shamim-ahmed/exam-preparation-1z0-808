package edu.buet.cse.oca.q58;

public class FinallyTrial {
  public static void main(String... args) {
    System.out.println(foo());
  }

  static int foo() {
    int result = 0;

    try {
      for (int i = 0; i < 5; i++) {
        result += i;
      }

      return result;
    } catch (Exception ex) {
      return -1;
    } finally {
      return 777;
    }
  }
}
