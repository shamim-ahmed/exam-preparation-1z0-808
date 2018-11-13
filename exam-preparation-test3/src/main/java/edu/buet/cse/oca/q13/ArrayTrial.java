package edu.buet.cse.oca.q13;

public class ArrayTrial {
  public static void main(String... args) throws Exception {
    int[] a = null;

    System.out.println(a[getIndex()]); // which exception will be thrown ?
  }

  private static int getIndex() throws Exception {
    throw new Exception("Forget it !");
  }
}
