package edu.buet.cse.oca.q59;

public class Switcher {
  public static void main(String... args) {
    byte b = foo();

    switch (b) {
      case 1:
        boolean flag = true;
        break;
      case 127:
        flag = false;   // no compilation error !
        break;
      default:
        break;
    }

    System.out.println(b);
  }

  static byte foo() {
    return 127; // no cast necessary
  }
}
