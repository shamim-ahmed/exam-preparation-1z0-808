package edu.buet.cse.oca.q13.test;

import edu.buet.cse.oca.q13.other.*;

public class Trial {
  public static void main(String... args) {
    String hello = "Hello", lo = "lo";

    System.out.println(hello == OtherClass.hello);
    System.out.println(hello == AuxiliaryClass.hello);
    System.out.println(hello == "Hel" + "lo");
    System.out.println(hello == "Hel" + lo);
    System.out.println(hello == ("Hel" + lo).intern());
  }
}

class AuxiliaryClass {
  static String hello = "Hello";
}
