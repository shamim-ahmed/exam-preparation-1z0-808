package edu.buet.cse.oca.q12;

public class ArrayTrial {
  public static void main(String... args) {
    int[] a = {2, 7, 8, 9};
    int[] b = {3, 4, 5, 6};

    int i = a[(a = b)[0]];
    System.out.println(i);
  }
}
