package edu.buet.cse.oca.q45;

public class Trial {
  public static void main(String... args) {
    System.out.println(foo());
    System.out.println(charFoo());

    switch (foo()) {
      case 1: // integer literal is fine
      case 2:
        break;
      case 127:
        System.out.println("Hello world !!");
        break;
      default:
        break;
    }
  }

  static byte foo() {
    return 127; // no cast needed
  }

  static char charFoo() {
    return 97; // no cast needed
  }
}
