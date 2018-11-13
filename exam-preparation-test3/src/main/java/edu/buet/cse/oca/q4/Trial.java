package edu.buet.cse.oca.q4;

public class Trial {
  public static void main(String... args) {
    System.out.println(parseFloat("3.14"));
  }

  private static float parseFloat(String s) {
    float f = 0.0f;

    try {
      f = Float.valueOf(s).floatValue();
      return f;
    } catch (Exception ex) {
      f = Float.NaN;
      return f;
    } finally {
      System.out.println("Done");
    }

    // return f;
  }
}
