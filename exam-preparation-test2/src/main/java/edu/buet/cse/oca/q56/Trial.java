package edu.buet.cse.oca.q56;

class A {
  A() {
    print();
  }

  void print() {
    System.out.println("A");
  }
}


class B extends A {
  int i = 4;

  void print() {
    System.out.println(i);
  }
}


public class Trial {
  public static void main(String... args) {
    A a = new B();
    a.print();
  }
}
