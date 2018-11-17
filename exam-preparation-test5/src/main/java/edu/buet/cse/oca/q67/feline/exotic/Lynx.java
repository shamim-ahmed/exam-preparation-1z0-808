package edu.buet.cse.oca.q67.feline.exotic;

import edu.buet.cse.oca.q67.feline.Cat;

public class Lynx extends Cat {
  public Lynx(String s) {
    super(s);
  }

  public static void main(String... args) {
    Cat cat = new Cat("Wild Cat");
    // the following does not compile
    // System.out.println(cat.name);

    Lynx lynx = new Lynx("Siberian Lynx");
    System.out.println(lynx.name); // but this is okay !!
  }
}
