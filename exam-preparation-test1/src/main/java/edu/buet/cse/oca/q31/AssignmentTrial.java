package edu.buet.cse.oca.q31;

import java.util.Arrays;

public class AssignmentTrial {
  public static void main(String... args) {
    int[] values = {12, 24, 36, 48, 60};
    int i = 4;

    values[i] = i = 0;
    System.out.println(Arrays.toString(values));
  }
}
