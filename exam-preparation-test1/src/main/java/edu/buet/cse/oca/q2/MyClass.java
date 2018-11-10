package edu.buet.cse.oca.q2;

public class MyClass {
  public static void main(String... args) {
    byte b = 127;
    char c = 96;
    c++;
    int i = 0b100_000;

    // c = i;
    // c = 5L;
    System.out.println(b + c + i + "");
    System.out.println(b + c + "" + i);
    System.out.println(b + "" + c + i);
    System.out.println("" + b + c + i);
  }
}
