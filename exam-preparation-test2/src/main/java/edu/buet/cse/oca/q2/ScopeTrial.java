package edu.buet.cse.oca.q2;

public class ScopeTrial {
  private int j;

  public void loop() {
    while (j <= 5) {
      for (int j = 1; j <= 5; j++) {
        System.out.print(j + " ");
      }

      System.out.println();
      j++;
    }
  }

  public static void main(String... args) {
    ScopeTrial trial = new ScopeTrial();
    trial.loop();
  }
}
