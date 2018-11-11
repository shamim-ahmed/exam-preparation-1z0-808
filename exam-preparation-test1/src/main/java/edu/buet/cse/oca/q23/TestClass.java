package edu.buet.cse.oca.q23;

class ABCD {
  int x = 10;
  static int y = 20;
}


class MNOP extends ABCD {
  int x = 30;
  static int y = 40;
}


public class TestClass {
  public static void main(String... args) {
    ABCD abcd = new MNOP();
    System.out.println(abcd.x + " " + abcd.y);

    MNOP mnop = (MNOP) abcd;
    System.out.println(mnop.x + " " + mnop.y);
  }
}
