package edu.buet.cse.oca.init;

public class B extends A {
  int value = 10;

  @Override
  public void print() {
    System.out.println("value = " + value);
  }

  public static void main(String... args) {
    A a = new B();
    a.print();
  }
}
