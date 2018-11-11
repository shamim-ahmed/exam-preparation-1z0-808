package edu.buet.cse.oca.q75;

class A {
  public int i = 10;
  private int k = 20;
}


class B extends A {
  private int i = 30;
  public int j = 40;
}


class C extends B {
}


public class AccessTrial {
  public static void main(String... args) {
    C c = new C();
    // System.out.println(c.i);
    System.out.println(((A) c).i);
    // System.out.println(c.k);
    System.out.println(c.j);
  }
}
