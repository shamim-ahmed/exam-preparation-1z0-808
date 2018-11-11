package edu.buet.cse.oca.q49;

interface I1 {
  int VALUE = 10;

  void print();
}


interface I2 {
  int VALUE = 20;

  void print();
}


public class TestClass implements I1, I2 {
  public static void main(String... args) {
    TestClass tc = new TestClass();
    tc.print();

    System.out.println(((I1) tc).VALUE);
    System.out.println(((I2) tc).VALUE);
  }

  @Override
  public void print() {
    System.out.println("Hello");
  }
}
