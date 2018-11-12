package edu.buet.cse.oca.q58;

public class LabelTrial {
  public static void main(String... args) {
    int i = 0;

    myLoop: {
      System.out.println("Executing the loop...");

      try {
        for (; true; i++) {
          if (i > 5) {
            break myLoop;
          }
        }
      } catch (Exception ex) {
        System.err.println(ex);
      } finally {
        System.out.println("In finally...");
      }
    }
  }
}
