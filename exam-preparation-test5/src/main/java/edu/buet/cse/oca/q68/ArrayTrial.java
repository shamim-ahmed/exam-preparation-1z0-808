package edu.buet.cse.oca.q68;

import java.util.Arrays;

public class ArrayTrial {
  public static void main(String... args) {
    int[] values = {2, 4, 6, 8, 10, 12};
    int i = 0;
    values[i] = i = 64; // will this cause an exception ?

    System.out.println(i);
    System.out.println(Arrays.toString(values));
  }
}
